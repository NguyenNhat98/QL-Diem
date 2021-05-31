package com.qldiem.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.qldiem.daos.LopDAO;
import com.qldiem.daos.SinhVienDAO;
import com.qldiem.models.Khoa;
import com.qldiem.models.Lop;
import com.qldiem.models.sinhvien;



public class AdminSinhVienController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AdminSinhVienController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		if(session.getAttribute("userInfor") == null) {
			response.sendRedirect(request.getContextPath()+"/auth/login");
			return;
		}
		
		SinhVienDAO sinhvienDAO = new SinhVienDAO();
		List<sinhvien> sinhvienList = sinhvienDAO.findAll();
		request.setAttribute("sinhvienList", sinhvienList);
		
		LopDAO lopDAO = new LopDAO();
		List<Lop> lopList = lopDAO.findAll();
		request.setAttribute("lopList", lopList);
		
		RequestDispatcher rd = request.getRequestDispatcher("/views/admin/sinhvien.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		
		SinhVienDAO sinhvienDAO = new SinhVienDAO();
		
		int masv = 0;
		try {
			masv = Integer.parseInt(request.getParameter("masv"));
		} catch (NumberFormatException e) {
			System.out.println("Li..!");
		}
		String tensv = request.getParameter("tensv");
		String diachi = request.getParameter("diachi");
		int sdt = 0;
		try {
			sdt = Integer.parseInt(request.getParameter("sdt"));
		} catch (NumberFormatException e) {
			System.out.println("Li..!");
		}
		String email = request.getParameter("email");
		int malop = 0;
		try {
			malop = Integer.parseInt(request.getParameter("malop"));
		} catch (NumberFormatException e) {
			System.out.println("Li..!");
		}

		sinhvien objSV = new sinhvien(masv, tensv, diachi, sdt, email, 
				new Lop(malop, null,
						new Khoa(null, null, null)));
		int add = sinhvienDAO.add(objSV);
		if(add > 0) {
			response.sendRedirect(request.getContextPath()+"/admin/sinhvien?msg=OK");
			return;
		}else {
			response.sendRedirect(request.getContextPath()+"/admin/sinhvien?msg=ERROR");
			return;
		}
		
	}

}
