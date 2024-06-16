package com.cec.results;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FourthSem
 */
@WebServlet("/FourthSem")
public class FourthSem extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private PrintWriter out;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FourthSem() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		 out = res.getWriter();
		int cs1 = Integer.parseInt(req.getParameter("cs1"));
		int cm1 = Integer.parseInt(req.getParameter("cm1"));

		int cs2 = Integer.parseInt(req.getParameter("cs2"));
		int cm2 = Integer.parseInt(req.getParameter("cm2"));

		int cs3 = Integer.parseInt(req.getParameter("cs3"));
		int cm3 = Integer.parseInt(req.getParameter("cm3"));

		int cs4 = Integer.parseInt(req.getParameter("cs4"));
		int cm4 = Integer.parseInt(req.getParameter("cm4"));

		int cs5 = Integer.parseInt(req.getParameter("cs5"));
		int cm5 = Integer.parseInt(req.getParameter("cm5"));

		int cs6 = Integer.parseInt(req.getParameter("cs6"));
		int cm6 = Integer.parseInt(req.getParameter("cm6"));

		int cs7 = Integer.parseInt(req.getParameter("cs7"));
		int cm7 = Integer.parseInt(req.getParameter("cm7"));

		int cs8 = Integer.parseInt(req.getParameter("cs8"));
		int cm8 = Integer.parseInt(req.getParameter("cm8"));

		int cs9 = Integer.parseInt(req.getParameter("cs9"));
		int cm9 = Integer.parseInt(req.getParameter("cm9"));

		int cs10 = Integer.parseInt(req.getParameter("cs10"));
		int cm10 = Integer.parseInt(req.getParameter("cm10"));

		float totalCredits = checkGp(cm1) * cs1 +checkGp(cm2) * cs2 +checkGp(cm3) * cs3 +checkGp(cm4) * cs4+ checkGp(cm5) * cs5 +checkGp(cm6) * cs6+checkGp(cm7) * cs7 +checkGp(cm8) * cs8+checkGp(cm9) * cs9+checkGp(cm10) * cs10;
		float credits=cs1+cs2+cs3+cs4+cs5+cs6+cs7+cs8+cs9+cs10;
		
		float sgpa=totalCredits/credits;
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("index.html");
		dispatcher.include(req, res);
		
		out.print("The SGPA = "+sgpa);
		
		

	}

	static int checkGp(int i) {
		if (i >= 90 && i <= 100) {
			return 10;
		} else if (i >= 80 && i <= 89) {
			return 9;
		} else if (i >= 70 && i <= 79) {
			return 8;
		} else if (i >= 60 && i <= 69) {
			return 7;
		} else if (i >= 55 && i <= 59) {
			return 6;
		} else if (i >= 50 && i <= 54) {
			return 5;
		} else if (i >= 40 && i <= 49) {
			return 4;
		} else {
			return 0;
		}
	}

}
