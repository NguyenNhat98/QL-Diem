package qldiem.com.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import qldiem.com.daos.TaiKhoanDAO;
import qldiem.com.models.taikhoan;



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
		
		//Kiểm tra thông tin đăng nhập
		taikhoan userInfor = taiKhoanDAO.findUsernameANDPass(username, pass);
		if(userInfor != null) {
			
			//lấy thông tin đăng nhập(session)
			taikhoan taikhoan = taiKhoanDAO.viewAll(username);
			if(taikhoan != null) {
				 HttpSession session = request.getSession(); 
				 session.setAttribute("userInfor",taikhoan);
				//Chuyển hướng sang trang index admin
				 response.sendRedirect(request.getContextPath()+"/admin");
			}
		}else {
			// Đăng nhập sai
			response.sendRedirect(request.getContextPath()+"/auth/login?msg=ERROR");
			return;
		}
		
	}

}
