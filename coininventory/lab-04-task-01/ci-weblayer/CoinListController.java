package com.ericsson.ci.weblayer.servlet;

import java.io.IOException;
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

	@EJB
	private CoinFacade facade;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LOGGER.info("Get All Hungarian Coins");
		try {
			final List<CoinStub> coins = this.facade.getCoins("HUN");
			request.setAttribute("coins", coins);
		} catch (final FacadeException e) {
			LOGGER.error(e, e);
		}
		final RequestDispatcher view = request.getRequestDispatcher("coins.jsp");
		view.forward(request, response);
	}

}
