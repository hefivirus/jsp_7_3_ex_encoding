package com.javamingu.ex;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EncodingEx
 */
@WebServlet("/EncodingEx")
public class EncodingEx extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EncodingEx() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("Get방식으로 실행 되었습니다.");
	
	String name= request.getParameter("name");
	response.setContentType("text/html; charset=EUC-kr");
	PrintWriter writer = response.getWriter();
	
	writer.println("<html><head></head><body>");
	writer.println("안녕하세요."+ name + "님 반갑습니다.<br/>");
	writer.println("</body></html>");
	
	writer.close();
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		System.out.println("Post방식으로 실행 되었습니다.");
		
		//post방식만 쓸 수 있음
		//request.setCharacterEncoding("EUC-KR");
		
		String name= request.getParameter("name");
		response.setContentType("text/html; charset=EUC-kr");
		PrintWriter writer = response.getWriter();
		
		writer.println("<html><head></head><body>");
		writer.println("안녕하세요."+ name + "님 반갑습니다.<br/>");
		writer.println("</body></html>");
		
		writer.close();
		
	}

}
