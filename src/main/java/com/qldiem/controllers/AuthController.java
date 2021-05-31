package com.qldiem.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.qldiem.daos.TaiKhoanDAO;
import com.qldiem.models.taikhoan;



public class AuthController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AuthController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		RequestDispatcher rd = request.getRequestDispatcher("/views/login/login.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		
		TaiKhoanDAO taiKhoanDAO = new TaiKhoanDAO();
		
		String username = request.getParameter("username");
		String pass = request.getParameter("pass");
		
		//KIEM TRA THONG TIN DAN NHAP
		taikhoan userInfor = taiKhoanDAO.findUsernameANDPass(username, pass);
		if(userInfor != null) {
			
			//LAY THONG TIN DANG NHAP(session)
			taikhoan taikhoan = taiKhoanDAO.viewAll(username);
			if(taikhoan != null) {
				 HttpSession session = request.getSession(); 
				 session.setAttribute("userInfor",taikhoan);
				//Chuyen sang trang index admin
				 response.sendRedirect(request.getContextPath()+"/admin");
			}
		}else {
			// dang nhap sai
			response.sendRedirect(request.getContextPath()+"/auth/login?msg=ERROR");
			return;
		}
		
	}

}
