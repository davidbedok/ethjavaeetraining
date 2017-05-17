package com.ericsson.ci.weblayer.servlet;

import java.io.IOException;

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

@WebServlet("/Coin")
public class CoinController extends HttpServlet {

	private static final long serialVersionUID = -4068275526750462197L;

	private static final Logger LOGGER = Logger.getLogger(CoinController.class);

	@EJB
	private CoinFacade facade;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		final String catalog = request.getParameter("catalog");

		try {
			CoinStub coin = this.facade.getCoin(catalog);
			request.setAttribute("coin", coin);
		} catch (final FacadeException e) {
			LOGGER.error(e, e);
		}
		final RequestDispatcher view = request.getRequestDispatcher("coin.jsp");
		view.forward(request, response);

	}

}
