package com.ericsson.ci.weblayer.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ericsson.ci.ejbservice.facade.CoinFacade;
import com.ericsson.ci.ejbservice.domain.CoinStub;
import com.ericsson.ci.ejbservice.domain.QualityStub;

@WebServlet("/CoinInventory")
public class ListDummyServlet extends HttpServlet {

	private static final long serialVersionUID = -5176397998772631455L;

	@EJB
	private CoinFacade facade;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<CoinStub> coins = null;

		String catalogNumber = request.getParameter("catalog");
		String quality = request.getParameter("quality");
		String country = request.getParameter("country");

		try {
			if (quality != null) {
				coins = this.facade.getCoins(QualityStub.valueOf(quality));
			} else if (country != null) {
				coins = this.facade.getCoins(country);
			} else if (catalogNumber != null) {
				coins = new ArrayList<>();
				coins.add(this.facade.getCoin(catalogNumber));
			} else {
				coins = this.facade.getCoins();
			}
		} catch (Exception e) {
			//
		}

		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		for (CoinStub coin : coins) {
			out.println(coin.toString());
		}
		out.close();
	}

}
