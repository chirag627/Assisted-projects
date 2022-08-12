package com.myapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class searchProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Connection conn;
	PreparedStatement query;
	private ResultSet result;

	@Override
	public void init(ServletConfig config) throws ServletException {
		ServletContext context = config.getServletContext();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(context.getInitParameter("dbHost"), context.getInitParameter("dbUser"),
					context.getInitParameter("dbPass"));

		} catch (SQLException e) {
			System.out.println("Connection to the database failed...");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver not found...");
		}

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter pw = resp.getWriter();
		String product = req.getParameter("product");

		try {
			PreparedStatement query = conn.prepareStatement("Select * from products where prodid = ?");
			query.setString(1, product);
			result = query.executeQuery();

			if (result.next()) {
				pw.println(
						"<div style=\"display: inline-block; position: fixed; top: 0; bottom: 0; left: 0; right: 0; width: 400px; height: 350px; margin: auto;\"><center><h1 style=\"font-size: 34px; line-height: 40px; font-weight: 400;\">Product Details</h1></center>");

				pw.println("<table style=\"border : 1px solid black;border-spacing: 10px;\">");
				pw.println("<tr>");
				pw.println("<th>Product name</th>");
				pw.println("<th>Product Category</th>");
				pw.println("<th>Product Price</th>");
				pw.println("<tr>");
				pw.println("<tr>");
				pw.println("<td>" + result.getString(2) + "</td>");
				pw.println("<td>" + result.getString(3) + "</td>");
				pw.println("<td>" + result.getString(4) + "</td>");
				pw.println("</tr>");
				pw.println("</table>");
				pw.println("</center>");
				pw.println("</div>");

			} else {
				pw.println(
						"<div style=\"display: inline-block; position: fixed; top: 0; bottom: 0; left: 0; right: 0; width: 400px; height: 350px; margin: auto;\"><center><h1 style=\"font-size: 34px; line-height: 40px; font-weight: 400;\">Product Details</h1></center>");
				pw.println("<table style=\"border : 1px solid black;border-spacing: 10px;\">");
				pw.println("Sorry Product out of stock");
				pw.println("</table>");
				pw.println("</center>");
				pw.println("</div>");

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void destroy() {
		try {
			query.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
