package com.revature.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.models.Reimbursement;
import com.revature.services.ReimbursementService;

import com.revature.util.CorsFix;

public class ReimbursementServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ReimbursementService rs = new ReimbursementService();
	// object to convert to JSON format
	private ObjectMapper om = new ObjectMapper();
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// Specifying that the response content-type will be JSON
				CorsFix.addCorsHeader(req.getRequestURI(), resp);
				resp.addHeader("Content-Type", "application/json");
				HttpSession session = req.getSession();
				String pathInfo = req.getPathInfo();
				
				List<Reimbursement> test = rs.getReimbursements();
				PrintWriter testWriter = resp.getWriter();
				testWriter.write(om.writeValueAsString(test));

	}
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
	CorsFix.addCorsHeader(req.getRequestURI(), resp);
	resp.addHeader("Content-Type", "application/json");
	HttpSession session = req.getSession();
	String pathInfo = req.getPathInfo();
	if (pathInfo == null && session.getAttribute("userRole").equals("MANAGER")) {
		
	} else { resp.sendError(401,"Unauthorized.");
	
	}}}
