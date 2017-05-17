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

import com.ericsson.ci.ejbservice.domain.CollectionStub;
import com.ericsson.ci.ejbservice.facade.CollectorFacade;
import com.ericsson.ci.ejbserviceclient.exception.FacadeException;

@WebServlet("/Collections")
public class CollectionListController extends HttpServlet {

	private static final long serialVersionUID = 546873803376455699L;

	private static final Logger LOGGER = Logger.getLogger(CollectionListController.class);

	@EJB
	private CollectorFacade facade;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LOGGER.info("Get user's collection");
		try {
			List<CollectionStub> collections = this.facade.getCollections("edvibed");
			request.setAttribute("collections", collections);
		} catch (final FacadeException e) {
			LOGGER.error(e, e);
		}
		final RequestDispatcher view = request.getRequestDispatcher("collections.jsp");
		view.forward(request, response);
	}

}
