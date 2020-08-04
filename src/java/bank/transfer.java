/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

import static java.lang.System.out;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author MUTHINA
 */
@WebServlet("/transfer")
public class transfer extends HttpServlet{
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) {
		//String acno = request.getParameter("acno");
                String rcv = request.getParameter("rcv");
          
		
                
		try {
			 
				Connection con = Dbconnection.getConnection();
                                 
				String s = "UPDATE  userdetails SET Balance=Balance+1000 WHERE AccountNo=?";
                                String s1 = "UPDATE  userdetails SET Balance=Balance-1000 WHERE AccountNo=?";
                                String s2="insert into accountdetails(receiver,amount,sender) values(?,1000,?)";
                                PreparedStatement pst = con.prepareStatement(s);
                                pst.setString(1, rcv);
                               PreparedStatement pst1 = con.prepareStatement(s1);
                               HttpSession session=request.getSession(false);
				//pst.setString(1, (String)session.getAttribute("acno"));	
                              pst1.setString(1, (String)session.getAttribute("acno"));
                              // pst1.setString(1,acno);
                               PreparedStatement pst2 = con.prepareStatement(s2);
                               pst2.setString(1, rcv);
                              pst2.setString(2, (String)session.getAttribute("acno"));
                              // pst2.setString(1, acno);
                               
     
                                
				//pst.setString(2, pwd);
				int i = pst.executeUpdate();
                                int j = pst1.executeUpdate();
                                int k = pst2.executeUpdate();
				if(i>0) {
					 RequestDispatcher rd=  request.getRequestDispatcher("transaction");
					 rd.forward(request, response);
                                    
			}
                                else
                                    //System.out.println("failed");
                                    {
					 RequestDispatcher rd=  request.getRequestDispatcher("loginfailed.jsp");
					 rd.forward(request, response);
                                    
			}
		}
			catch (Exception e) { 
				e.printStackTrace();
			}
				
	
	}
	}
 
