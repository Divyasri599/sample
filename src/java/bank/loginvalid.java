/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/loginvalid")
public class loginvalid extends HttpServlet {

	
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) {
		String uname = request.getParameter("name");
		String pwd = request.getParameter("password");
		try {
			 
				Connection con = Dbconnection.getConnection();
				String s = "select * from userdetails where Name=? and AccountNo=?";
				PreparedStatement pst = con.prepareStatement(s);
                                HttpSession session=request.getSession();
                                session.setAttribute("name",uname);
                                session.setAttribute("acno",pwd);
				pst.setString(1, uname);	
				pst.setString(2, pwd);
				ResultSet rs = pst.executeQuery();
				if(rs.next()) {
					 RequestDispatcher rd=  request.getRequestDispatcher("loginsuccess.jsp");
					 rd.forward(request, response);
				}else {
					 RequestDispatcher rd=  request.getRequestDispatcher("loginfailed.jsp");
					 rd.forward(request, response);
				}
				
				
			
		}
			catch (Exception e) { 
				e.printStackTrace();
			}
				
	
	}
	}
