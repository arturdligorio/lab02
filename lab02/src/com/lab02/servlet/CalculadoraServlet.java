package com.lab02.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalculadoraServlet
 */
public class CalculadoraServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static Logger log = Logger.getLogger(CalculadoraServlet.class.getName());

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Double op1 = new Double(0);
		Double op2 = new Double(1);
		String operador = request.getParameter("operador");
		String operando1 = request.getParameter("operando1");
		String operando2 = request.getParameter("operando2");

		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();

		try {

			op1 = Double.parseDouble(operando1);

		} catch (NumberFormatException e) {

			out.println("<html><head>");
			out.println("<title>Calculadora</title>");
			out.println("</head><body><h1>Error</h1>");
			out.println("<p>Entrada de Dados do operando 1 está invalida</p>");
			out.println("</body></html>");

			out.close();

		} catch (Exception e) {

			log.severe("Error desconhecido no try/catch\n" + e);

		}

		try {

			op2 = Double.parseDouble(operando2);

		} catch (NumberFormatException e) {

			out.println("<html><head>");
			out.println("<title>Calculadora</title>");
			out.println("</head><body><h1>Error</h1>");
			out.println("<p>Entrada de Dados do operando 2 está invalida</p>");
			out.println("</body></html>");

			out.close();

		} catch (Exception e) {

			log.severe("Error desconhecido no try/catch\n" + e);

		}

		out.println("Result:\t" + operador + "operador 1:\t" + op1 + "operador 2:\t" + op2);

		// Double resultado = operação(operador, op1, op2);
	}

}
