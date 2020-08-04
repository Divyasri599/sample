/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

/**
 *
 * @author MUTHINA
 *
 * 
 * */
/*
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SearchFriendsServlet
 
@WebServlet("/balance")
public class balance extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");
		System.out.println(name);
		HttpSession session=  request.getSession(false);
		
		try {
			Connection con = Dbconnection.getConnection();
			String q = "select Balance from userdetails where Name=?";
			PreparedStatement pst = con.prepareStatement(q);
			pst.setString(1,name);
			ResultSet rs = pst.executeQuery();
			List<UserDetails> list1 = new ArrayList<UserDetails>();

			while (rs.next()) {
				UserDetails ud = new UserDetails();
                                ud.setBalance(rs.getString("Balance"));
				list1.add(ud);
			}
			request.setAttribute("list", list1);
			RequestDispatcher rd = request.getRequestDispatcher("viewbal.jsp");
			rd.forward(request, response);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
**/

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/balance")
public class balance extends HttpServlet {

	
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) {
		//String acno = request.getParameter("acno");
		try {
			 
				Connection con = Dbconnection.getConnection();
				String s = "select Balance from userdetails where AccountNo=?";
				PreparedStatement pst = con.prepareStatement(s);
                                HttpSession session=request.getSession(false);
				pst.setString(1, (String)session.getAttribute("acno"));	
				ResultSet rs = pst.executeQuery();
                                List<UserDetails> list = new ArrayList<>();

                                while (rs.next()) {
				UserDetails ud = new UserDetails();
				ud.setBalance(rs.getString("Balance"));
				list.add(ud);
			}
			request.setAttribute("list", list);
			RequestDispatcher rd = request.getRequestDispatcher("accountbal.jsp");
			rd.forward(request, response);
					
		}
			catch (Exception e) { 
				e.printStackTrace();
			}
				
	
	}
	}
 

    
