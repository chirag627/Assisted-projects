package com.login.app;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class userDashboard extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		User u = new User();
try {
		HttpSession session = req.getSession(false);

		if (session.getAttribute("email") != null) {

			PrintWriter pw = resp.getWriter();
			pw.println("<center><h3>Welcome to dashboard</h3></center>");
			pw.println("<center><h2> Username: " + session.getAttribute("email") + "</center>");
			pw.println("<center><h2> Session id: " + session.getId() + "</center>");
			pw.println("<center><h2> Session Create at: " + (new Date(session.getCreationTime()).toString()) + "</center>");
			pw.println("<center><h2> Click here to logout: <a href='logout' >Logout</a></center>");

		} else {
			ServletContext sc = getServletContext();
			sc.getRequestDispatcher("/index.html").forward(req, resp);
		}
}
catch(NullPointerException e) {
	ServletContext sc = getServletContext();
	sc.getRequestDispatcher("/index.html").forward(req, resp);
}
	}
}
