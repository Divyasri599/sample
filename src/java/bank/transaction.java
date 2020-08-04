/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

/**
 *
 * @author MUTHINA
 */
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

@WebServlet("/transaction")
public class transaction extends HttpServlet {

	
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) 
		throws ServletException, IOException{
		try {
                               HttpSession session = request.getSession(false);
                               // String acno = request.getParameter("acno");
				Connection con = Dbconnection.getConnection();
				String s = "select * from accountdetails where (sender = ? OR receiver = ?)order by date desc limit 5";
				PreparedStatement pst = con.prepareStatement(s);
				//pst.setString(1, acno);
                               // pst.setString(2, acno);
                               // pst.setString(2, (String) session.getAttribute("password"));
                                pst.setString(1, (String)session.getAttribute("acno"));	
                                pst.setString(2, (String)session.getAttribute("acno"));	
                                
                                
				ResultSet rs = pst.executeQuery();
                                List<retrieve> list = new ArrayList<retrieve>();

			while (rs.next()) {
                            
				retrieve rd = new retrieve();
				rd.setAmount(rs.getInt("amount"));
				rd.setSender(rs.getString("sender"));
				rd.setReceiver(rs.getString("receiver"));
                               rd.setDate(rs.getTimestamp("date"));
				list.add(rd);
                        
                       
                        }  
			request.setAttribute("list", list);
			RequestDispatcher rds = request.getRequestDispatcher("viewtransaction.jsp");
			rds.forward(request, response);
                        
                       
					
		}
			catch (Exception e) { 
				e.printStackTrace();
			}
				
	
	}
	}
 
