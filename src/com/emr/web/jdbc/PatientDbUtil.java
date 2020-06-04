		package com.emr.web.jdbc;
		
		import java.sql.Connection;
		import java.sql.PreparedStatement;
		import java.sql.ResultSet;
		import java.sql.SQLException;
		import java.sql.Statement;
		import java.util.ArrayList;
		import java.util.List;
		
		import javax.sql.DataSource;
		
		public class PatientDbUtil {
		private DataSource dataSource;
		
		public PatientDbUtil(DataSource theDataSource) {
			dataSource=theDataSource;
		}
		
		public List<Patient> getPatients() throws Exception{
			List<Patient> patients =new ArrayList<>();
			//2.Get a connection to the database
					Connection myConn =null;
					Statement myStmt=null;
					ResultSet rs= null;
					
					try {
						//get a connection
						myConn =dataSource.getConnection();
						
						
						//create sql statement
						String sql ="select * from patient ";
						
						myStmt=myConn.createStatement();
						
						///execute query
						rs = myStmt.executeQuery(sql);
						
						//process result set
						while(rs.next()) {
							//retrieve data from result set row
							 int id = rs.getInt("id");
							 String first_name = rs.getString("first_name");		
							 String last_name = rs.getString("last_name");
							 String dob = rs.getString("dob");
							 String cellphone_no = rs.getString("cellphone_no");
							 String email = rs.getString("email");
							 String gender = rs.getString("gender");
							 String race = rs.getString("race");
							 String ethnicity = rs.getString("ethnicity");
							 String primary_language = rs.getString("primary_language");
							 String preferred_language = rs.getString("preferred_language");
							 String primary_insurance = rs.getString("primary_insurance");	
							 String ssn = rs.getString("ssn");			 
							 String create_date = rs.getString("create_date");
							 String last_update = rs.getString("last_update");
							
							//create new patient object
							 Patient tempPatient =new Patient(id,first_name,last_name,dob,cellphone_no,email,gender,race,
									 ethnicity,primary_language,preferred_language,primary_insurance,ssn,create_date,last_update );
							
							//add it to the list of patients
							 patients.add(tempPatient);
						}
						
						return patients;
					} 
					finally {
						//close JDBC objects
						close(myConn,myStmt,rs);
						
					}
		}
		
		private void close(Connection myConn, Statement myStmt, ResultSet rs) {
			
			try {
				if(rs != null) {
					rs.close();
				}
				
				if(myStmt != null) {
					myStmt.close();
				}
				
				
				if(myConn != null) {
					myConn.close(); //doesn't really close database ...just puts back in connection pool
				}
				
				
			}
			catch(Exception exc) {
				exc.printStackTrace();
			}
		}
		
		public void addPatient(Patient thePatient) throws SQLException {
			
			Connection myConn = null;
			PreparedStatement myStmt = null;
			
			try {
				//get db connection
				myConn = dataSource.getConnection();
				//create sql for insert
				String sql = "insert into patient"
				              +"(first_name,last_name,dob,cellphone_no,email,gender,race,ethnicity,primary_language,preferred_language,primary_insurance,ssn,create_date,last_update)"
			                  +"values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
				
				myStmt = myConn.prepareStatement(sql);
				              //set the param values for the patient
			
	//			myStmt.setInt(1, thePatient.getId());
				myStmt.setString(1, thePatient.getFirst_name());
				myStmt.setString(2, thePatient.getLast_name());
				myStmt.setString(3, thePatient.getDob());
				myStmt.setString(4, thePatient.getCellphone_no());
				myStmt.setString(5, thePatient.getEmail());		
				myStmt.setString(6, thePatient.getGender());
				myStmt.setString(7, thePatient.getRace());
				myStmt.setString(8, thePatient.getEthnicity());
				myStmt.setString(9, thePatient.getPrimary_language());
				myStmt.setString(10, thePatient.getPreferred_language());
				myStmt.setString(11, thePatient.getPrimary_insurance());	
				myStmt.setString(12, thePatient.getSsn());	
				myStmt.setString(13, thePatient.getCreate_date());
				myStmt.setString(14, thePatient.getLast_update());
				
			//execute sql insert
				myStmt.execute();
				
			
			}
			finally {
			
			//clean up JDBC objects
				close(myConn,myStmt,null);
		}
		
		}
		
		public Patient getPatients(String thePatientId) throws Exception {
			Patient thePatient =null;
			
			
			Connection myConn = null;
			PreparedStatement myStmt = null;
			ResultSet rs= null;
			int patientId;
			
			try {
				//convert patient id into int
				  patientId = Integer.parseInt(thePatientId);
				
				//get connection to database
				 myConn = dataSource.getConnection();
				
				//create sql to get selected patient
				 String sql = "select * from patient where id=?";
				
				//create prepared statement
				 myStmt = myConn.prepareStatement(sql);
				
				//set params
				 myStmt.setInt(1, patientId);
				 
				//execute statement
				 rs = myStmt.executeQuery();
				
				//retrieve data from result set row
				 if(rs.next()) {
					 
					 String first_name = rs.getString("first_name");
					 String last_name = rs.getString("last_name");
					 String dob = rs.getString("dob");
					 String cellphone_no = rs.getString("cellphone_no");
					 String email = rs.getString("email"); 
					 String gender = rs.getString("gender");
					 String race = rs.getString("race");
					 String ethnicity = rs.getString("ethnicity");
					 String primary_language = rs.getString("primary_language");
					 String preferred_language = rs.getString("preferred_language");
					 String primary_insurance = rs.getString("primary_insurance");		 
					 String ssn = rs.getString("ssn"); 
					 String create_date = rs.getString("create_date");
					 String last_update = rs.getString("last_update");
					
					//create new patient object
					thePatient =new Patient(patientId,first_name,last_name,dob,cellphone_no,email,gender,race,
							 ethnicity,primary_language,preferred_language,primary_insurance,ssn,create_date,last_update );
					
				 }
				 else {
					 throw new Exception("Could not find patient id :"+ patientId  );
				 }
				return thePatient;
			}
			finally {
				//clean up JDBC objects
						close(myConn,myStmt,rs);
			}
			
		}
		
		public void updatePatient(Patient thePatient) throws SQLException {
			Connection myConn = null;
			PreparedStatement myStmt = null;
			
			try {
			//get db connection
			myConn = dataSource.getConnection();
			
			
			//create SQL update statement
			 String sql = "update patient set first_name=?,last_name=?,dob=?,cellphone_no=?,email=?,gender=?,race=?,ethnicity=?,primary_language=?,preferred_language=?,primary_insurance=?,ssn=?,create_date=?,last_update=? "
					 + "where id=?";
			
			
			//prepare statement
			 myStmt = myConn.prepareStatement(sql);
			
			
			//set params
			 
				myStmt.setString(1, thePatient.getFirst_name());
				myStmt.setString(2, thePatient.getLast_name());
				myStmt.setString(3, thePatient.getDob());
				myStmt.setString(4, thePatient.getCellphone_no());
				myStmt.setString(5, thePatient.getEmail());	
				myStmt.setString(6, thePatient.getGender());
				myStmt.setString(7, thePatient.getRace());
				myStmt.setString(8, thePatient.getEthnicity());
				myStmt.setString(9, thePatient.getPrimary_language());
				myStmt.setString(10, thePatient.getPreferred_language());
				myStmt.setString(11, thePatient.getPrimary_insurance());	
				myStmt.setString(12, thePatient.getSsn());
				myStmt.setString(13, thePatient.getCreate_date());
				myStmt.setString(14, thePatient.getLast_update());
				myStmt.setInt(15, thePatient.getId());
			
			
			//execute SQL statement
				myStmt.execute();
			}
			finally {
				//clean up JDBC objects
				close(myConn,myStmt,null);
			}
			
		}
	
		public void deleteStudent(String thePatientId) throws Exception {
	
			Connection myConn = null;
			PreparedStatement myStmt = null;
			
			try {
				// convert patient id to int
				int patientId = Integer.parseInt(thePatientId);
				
				// get connection to database
				myConn = dataSource.getConnection();
				
				// create sql to delete patient
				String sql = "delete from patient where id=?";
				
				// prepare statement
				myStmt = myConn.prepareStatement(sql);
				
				// set params
				myStmt.setInt(1, patientId);
				
				// execute sql statement
				myStmt.execute();
			}
			finally {
				// clean up JDBC code
				close(myConn, myStmt, null);
			}	
		}
	}
