package com.ericsson.ci.weblayer.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.ericsson.ci.ejbservice.facade.CoinFacade;
import com.ericsson.ci.ejbserviceclient.domain.CoinStub;
import com.ericsson.ci.ejbserviceclient.exception.FacadeException;

@WebServlet("/CoinList")
public class CoinListController extends HttpServlet {

	private static final long serialVersionUID = 546873803376455699L;

	private static final Logger LOGGER = Logger.getLogger(CoinListController.class);

	private static final String NATIONAL_IDENTIFIER = "HUN";
	private static final String EMPTY_FILTER = "-1";

	@EJB
	private CoinFacade facade;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.process(request, response);
	}

	@Override
	protected void doPost(final HttpServletRequest request, final HttpServletResponse response) throws ServletException, IOException {
		this.process(request, response);
	}

	private void process(final HttpServletRequest request, final HttpServletResponse response) throws ServletException, IOException {
		String filterPeriod = request.getParameter("period");
		if (filterPeriod == null) {
			filterPeriod = EMPTY_FILTER;
		}
		LOGGER.info("Get filtered Hungarian Coins (period: " + filterPeriod + ")");
		List<String> periods = new ArrayList<>();
		List<CoinStub> coins = new ArrayList<>();
		try {
			periods = this.facade.getPeriods(NATIONAL_IDENTIFIER);
			if (!EMPTY_FILTER.equals(filterPeriod)) {
				coins = this.facade.getCoins(NATIONAL_IDENTIFIER, filterPeriod);
			} else {
				coins = this.facade.getCoins(NATIONAL_IDENTIFIER);
			}
		} catch (final FacadeException e) {
			LOGGER.error(e, e);
		}
		this.forward(request, response, filterPeriod, periods, coins);
	}

	private void forward(final HttpServletRequest request, final HttpServletResponse response, String filterPeriod, List<String> periods, List<CoinStub> coins)
			throws ServletException, IOException {
		request.setAttribute("filterPeriod", filterPeriod);
		request.setAttribute("periods", periods);
		request.setAttribute("coins", coins);
		final RequestDispatcher view = request.getRequestDispatcher("coins.jsp");
		view.forward(request, response);
	}

}
