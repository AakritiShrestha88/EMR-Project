package com.emr.web.jdbc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 * Servlet implementation class EmrTestServlet
 */
@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	
	@Resource(name="jdbc/Emr-project-web" )
	
	private DataSource dataSource;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		//1.Set up the printwriter
		PrintWriter out =response.getWriter();
		response.setContentType("text/plain");
		
		
		//2.Get a connection to the database
		Connection myConn =null;
		Statement myStmt=null;
		ResultSet rs= null;
		
		try {
			myConn =dataSource.getConnection();
			//3.Create a  SQL statements
			String sql ="select * from patient";
			myStmt=myConn.createStatement();
			
			//4.Execute SQL query
			rs = myStmt.executeQuery(sql);
	
			
			//5.Process the result set
			while(rs.next()) {
				//String output=(rs.getString("ethnicity")+" "+ rs.getString("middle_initial")); 
				
				String output=(rs.getInt("id")+"  "+rs.getString("first_name")+"  "+rs.getString("last_name")+
						rs.getString("dob")+rs.getString("cellphone_no")+rs.getString("email")+rs.getString("gender")+rs.getString("race")+
						rs.getString("ethnicity")+rs.getString("primary_language")+rs.getString("preferred_language")+rs.getString("primary_insurance")+
						rs.getString("ssn")+rs.getString("create_date")+rs.getString("last_update")); 
			out.println(output);
			}
			
		}catch(Exception ecx) {
			ecx.printStackTrace();
		}
	}

	
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

