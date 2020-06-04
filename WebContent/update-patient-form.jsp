<!DOCTYPE html>
<html>

<head>
	<title>Update Student</title>

	<link type="text/css" rel="stylesheet" href="css/style.css">
	<link type="text/css" rel="stylesheet" href="css/add-patient-style.css">	
</head>

<body>
	<div id="wrapper">
		<div id="header3">
			<h2>Patient Record</h2>
		</div>
	</div>
	
	<div id="container">
		<h3>Update Patient</h3>
		
		<form action="PatientControllerServlet" method="GET">
		
			<input type="hidden" name="command" value="UPDATE" />
			
			<input type="hidden" name="patientId" value="${THE_PATIENT.id }" />
			
			<table>
				<tbody>
					<%--  <tr>
						<td><label>Patient_id:</label></td>
						<td><input type="text" name="patient_id" value="${THE_PATIENT.patient_id }"/></td>
					</tr>   --%>

					<tr>
						<td><label>First name:</label></td>
						<td><input type="text" name="first_name" value="${THE_PATIENT.first_name}"/></td>
					</tr>

					<tr>
						<td><label>Last Name:</label></td>
						<td><input type="text" name="last_name" value="${THE_PATIENT.last_name }"/></td>
					</tr>

					<tr>
						<td><label>Date Of Birth:</label></td>
						<td><input type="text" name="dob" value="${THE_PATIENT.dob }"/></td>
					</tr>

					<tr>
						<td><label>Cell number:</label></td>
						<td><input type="text" name="cellphone_no" value="${THE_PATIENT.cellphone_no }"/></td>
					</tr>
					
					<tr>
						<td><label>Email:</label></td>
						<td><input type="text" name="email" value="${THE_PATIENT.email }"/></td>
					</tr>

					<tr>
						<td><label>gender:</label></td>
						<td><input type="text" name="gender" value="${THE_PATIENT.gender }"/></td>
					</tr>
					<tr>
						<td><label>Race:</label></td>
						<td><input type="text" name="race" value="${THE_PATIENT.race }"/></td>
					</tr>

					<tr>
						<td><label>Ethnicity:</label></td>
						<td><input type="text" name="ethnicity" value="${THE_PATIENT.ethnicity }"/></td>
					</tr>

					<tr>
						<td><label>Primary Language:</label></td>
						<td><input type="text" name="primary_language" value="${THE_PATIENT.primary_language }"/></td>
					</tr>
					
					<tr>
						<td><label>Preferred Language:</label></td>
						<td><input type="text" name="preferred_language" value="${THE_PATIENT.preferred_language }"/></td>
					</tr>

					<tr>
						<td><label>Primary Insurance:</label></td>
						<td><input type="text" name="primary_insurance" value="${THE_PATIENT.primary_insurance }"/></td>
					</tr>
					
					<tr>
						<td><label>SSN:</label></td>
						<td><input type="text" name="ssn" value="${THE_PATIENT.ssn }"/></td>
					</tr>
					
					<tr>
						<td><label>Create Date:</label></td>
						<td><input type="text" name="create_date" value="${THE_PATIENT.create_date }"/></td>
					</tr>

					<tr>
						<td><label>Last Update:</label></td>
						<td><input type="text" name="last_update" value="${THE_PATIENT.last_update }"/></td>
					</tr>
					
					<tr>
						<td><label></label></td>
						<td><input type="submit" value="Save" class="save" /></td>
					</tr>
					
				</tbody>
			</table>
		</form>
		
		<div style="clear: both;"></div>
		
		<p>
			<a href="PatientControllerServlet">Back to List</a>
		</p>
	</div>
</body>

</html>