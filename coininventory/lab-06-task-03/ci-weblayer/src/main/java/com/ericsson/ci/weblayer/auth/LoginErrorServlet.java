package com.ericsson.ci.weblayer.auth;

import java.io.IOException;
import java.util.ResourceBundle;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginError")
public class LoginErrorServlet extends HttpServlet {

	private static final long serialVersionUID = 1599166100486735562L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		final String userName = request.getParameter("j_username");

		ResourceBundle bundle = ResourceBundle.getBundle("messages", request.getLocale());

		request.setAttribute("username", userName);
		request.setAttribute("error", bundle.getString("login.failed"));

		final RequestDispatcher view = request.getRequestDispatcher("login.jsp");
		view.forward(request, response);
	}

}
