	package com.emr.web.jdbc;
	
	
	import java.io.IOException;
	import java.util.List;
	
	import javax.annotation.Resource;
	import javax.servlet.RequestDispatcher;
	import javax.servlet.ServletException;
	import javax.servlet.annotation.WebServlet;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;
	import javax.sql.DataSource;
	
	/**
	 * Servlet implementation class PatientControllerServlet
	 */
	@WebServlet("/PatientControllerServlet")
	public class PatientControllerServlet extends HttpServlet {
		private static final long serialVersionUID = 1L;
		
		
		private PatientDbUtil patientDbUtil;
		
		@Resource(name="jdbc/Emr-project-web" )
		private DataSource dataSource;
	
		
		
		
		@Override
		public void init() throws ServletException {
			
			super.init();
			//create our patient db util .... and pass in the conn pool/ datasource
			try {
				
				patientDbUtil= new PatientDbUtil(dataSource);
				
			}catch(Exception exc) {
				throw new ServletException(exc);
			}
		}
	
	
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			try {
				//Read the "command" parameter
				String theCommand = request.getParameter("command");
				
				//if the command is missing,then default to listing patients
				if(theCommand == null) {
					theCommand = "LIST";
				}
				
				//route to the appropriate method
				switch(theCommand) {
				case "LIST":
					listPatients(request,response);
					break;
					
					
				case "ADD":
					addPatient(request,response);
					break;
					
				case "LOAD":
					loadPatient(request,response);
					break;
					
					
				case "UPDATE":
					updatePatient(request,response);
					break;	
					
				case "DELETE":
					deletePatient(request,response);
					break;	
					
					
				default:
					listPatients(request,response);
				}
				
	//		//list the patient ... in MVC fashion
	//		
	//		listPatients(request,response);
			}catch( Exception exc) {
				throw new ServletException(exc);
				
			}
		}
	
	
		private void deletePatient(HttpServletRequest request, HttpServletResponse response) throws Exception{
			// read patient id from form data
					String thePatientId = request.getParameter("patientId");
					
					// delete patient from database
					patientDbUtil.deleteStudent(thePatientId);
					
					// send them back to "list patients" page
					listPatients(request, response);
			
		}
	
	
		private void updatePatient(HttpServletRequest request, HttpServletResponse response) throws Exception{
			//read patient info from form data
			int id=Integer.parseInt(request.getParameter("patientId"));
			String first_name=request.getParameter("first_name");
			String last_name=request.getParameter("last_name");
			String dob=request.getParameter("dob");
			String cellphone_no=request.getParameter("cellphone_no");
			String email=request.getParameter("email");
			String gender=request.getParameter("gender");
			String race=request.getParameter("race");
			String ethnicity=request.getParameter("ethnicity");
			String primary_language=request.getParameter("primary_language");
			String preferred_language=request.getParameter("preferred_language");
			String primary_insurance=request.getParameter("primary_insurance");
			String ssn=request.getParameter("ssn");
			String create_date=request.getParameter("create_date");
			String last_update=request.getParameter("last_update");
			
			//create a new patient object
			Patient thePatient = new Patient(id,first_name,last_name,dob,cellphone_no,email,gender,race,ethnicity,primary_language,preferred_language,primary_insurance,ssn,create_date,last_update);
			
			
			//perform update on database
			patientDbUtil.updatePatient(thePatient);
			
			//send them back to the " list patient page"
			listPatients(request,response);
		}
	
	
		private void loadPatient(HttpServletRequest request, HttpServletResponse response) throws Exception{
			//read patient info from form data
			String thePatientId = request.getParameter("patientId");
			
			
			//get patient from database (db util)
			Patient thePatient = patientDbUtil.getPatients(thePatientId);
			
			//place patient in the request attributes
			request.setAttribute("THE_PATIENT", thePatient);
			
			
			//send to jsp page: update-patient-form.jsp
			RequestDispatcher dispatcher = request.getRequestDispatcher("/update-patient-form.jsp");
			dispatcher.forward(request, response);
		}
	
	
		private void addPatient(HttpServletRequest request, HttpServletResponse response) throws Exception {
			//read patient info from form data
	//		int id=Integer.parseInt(request.getParameter("id"));
			String first_name=request.getParameter("first_name");
			String last_name=request.getParameter("last_name");
			String dob=request.getParameter("dob");
			String cellphone_no=request.getParameter("cellphone_no");
			String email=request.getParameter("email");
			String gender=request.getParameter("gender");
			String race=request.getParameter("race");
			String ethnicity=request.getParameter("ethnicity");
			String primary_language=request.getParameter("primary_language");
			String preferred_language=request.getParameter("preferred_language");
			String primary_insurance=request.getParameter("primary_insurance");
			String ssn=request.getParameter("ssn");
			String create_date=request.getParameter("create_date");
			String last_update=request.getParameter("last_update");
			
			//create a new patient object
			Patient thePatient = new Patient(first_name,last_name,dob,cellphone_no,email,gender,race,ethnicity,primary_language,preferred_language,primary_insurance,ssn,create_date,last_update);
			
			//add the patient to the database
			patientDbUtil.addPatient(thePatient);
			
			
			//send back to main page(the patient list)
			listPatients(request,response);
		}
	
	
		private void listPatients(HttpServletRequest request, HttpServletResponse response) throws Exception{
			
			//get patient from db util
			List<Patient> patients = patientDbUtil.getPatients();
			
			//add patients to the request
			request.setAttribute("PATIENT_LIST", patients);
			
			
			//SEND TO jsp PAGE(view)
			RequestDispatcher dispatcher = request.getRequestDispatcher("/list-patients.jsp");
			dispatcher.forward(request, response);
			
		}
	
	}
