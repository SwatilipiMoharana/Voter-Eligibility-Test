package com.nit.vote;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
@WebServlet("/Voter")
public class Voter extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter pw=res.getWriter();
		pw.println("login page");
		
		String Name=req.getParameter("Name");
		pw.println(" name:"+Name);
		int Age=Integer.parseInt(req.getParameter("Age"));
		pw.println("age:"+Age);
		if(Age>=18) {
			pw.println(Name+" is eligible for vote");
		}
		else {
			pw.println(Name+ " is not eligible for vote");
		}
		
		
	}

}
