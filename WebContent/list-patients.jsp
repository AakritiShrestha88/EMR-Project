<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"	%>
<!DOCTYPE html>
<html>
<head>
<title>Patients Tracker App</title>

<link type="text/css" rel ="stylesheet" href="css/style.css">
</head>

<body>

<div id="wrapper">
		<div id="header">
			<h2>Patient Details</h2>
		</div>
	</div>

	<div id="container">
	
		<div id="content">
		
		<input type="button" value="Add Patient" 
				   onclick="window.location.href='add-patient-form.jsp'; return false;"
				   class="add-patient-button"
			/>
		
		
			<table>
			
				<tr>
					<!-- <th>patient_id</th> -->
					<th>first_name</th>
					<th>last_name</th>
					<th>dob</th>
					<th>cellphone_no</th>
					<th>email</th>
					<th>gender</th>
					<th>race</th>
					<th>ethnicity</th>
					<th>primary_language</th>
					<th>preferred_language</th>
					<th>primary_insurance</th>
					<th>ssn</th>
					<th>create_date</th>
					<th>last_update</th>
					<th>Action</th>
				</tr>
				
				
				
				
				<c:forEach var="tempPatient" items="${PATIENT_LIST}">
				
				
				<!-- set up a link for each patient -->
				 <c:url var="tempLink" value="PatientControllerServlet">
						<c:param name="command" value="LOAD" />
						<c:param name="patientId" value="${tempPatient.id}" />
					</c:url>
					
					
					<!--  set up a link to delete a patient -->
					 <c:url var="deleteLink" value="PatientControllerServlet">
						<c:param name="command" value="DELETE" />
						<c:param name="patientId" value="${tempPatient.id}" />
					</c:url>  
				
					<tr>
					<%--  <td> ${tempPatient.patient_id}   </td>  --%>
						<td> ${tempPatient.first_name} </td>
						<td> ${tempPatient.last_name} </td>
						<td> ${tempPatient.dob} </td>
						<td> ${tempPatient.cellphone_no} </td>
						<td> ${tempPatient.email} </td>
						<td> ${tempPatient.gender} </td>
						<td> ${tempPatient.race} </td>
						<td> ${tempPatient.ethnicity} </td>
						<td> ${tempPatient.primary_language} </td>
						<td> ${tempPatient.preferred_language} </td>
						<td> ${tempPatient.primary_insurance} </td>
						<td> ${tempPatient.ssn} </td>
						<td> ${tempPatient.create_date} </td>
						<td> ${tempPatient.last_update} </td>
						<td> <a href="${tempLink}">Update</a> 
						 | 
						<a href="${deleteLink}"
							onclick="if (!(confirm('Are you sure you want to delete this patient?'))) return false">
							Delete</a> </td>
					</tr>
				
				</c:forEach>
				
				
			</table>
			
			
		</div>
	
	</div>
</body>
</html>