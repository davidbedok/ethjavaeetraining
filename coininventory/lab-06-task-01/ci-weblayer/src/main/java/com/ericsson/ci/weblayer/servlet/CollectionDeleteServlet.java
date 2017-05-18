package com.ericsson.ci.weblayer.servlet;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.ericsson.ci.ejbservice.facade.CollectorFacade;
import com.ericsson.ci.ejbserviceclient.domain.QualityStub;
import com.ericsson.ci.ejbserviceclient.exception.FacadeException;

@WebServlet("/CollectionDelete")
public class CollectionDeleteServlet extends HttpServlet {

	private static final long serialVersionUID = -7688739575153938635L;

	private static final Logger LOGGER = Logger.getLogger(CollectionDeleteServlet.class);

	@EJB
	private CollectorFacade facade;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		final String catalogNumber = request.getParameter("catalog");
		final String qualityName = request.getParameter("quality");
		final String userName = request.getParameter("user");
		LOGGER.info("Delete Collection (catalogNumber: " + catalogNumber + ", quality: " + qualityName + ")");
		try {
			QualityStub quality = QualityStub.valueOf(qualityName);
			this.facade.removeCollection(userName, catalogNumber, quality);
		} catch (final FacadeException e) {
			LOGGER.error(e, e);
		}
		response.sendRedirect("Collections");
	}

}
