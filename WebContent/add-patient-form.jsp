<!DOCTYPE html>
<html>

<head>
	<title>Add Student</title>

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
		<h3>Add Patient</h3>
		
		<form action="PatientControllerServlet" method="GET">
		
			<input type="hidden" name="command" value="ADD" />
			
			<table>
				<tbody>
					 <!-- <tr>
						<td><label>Patient_id:</label></td>
						<td><input type="text" name="patient_id" /></td>
					</tr>  -->

					<tr>
						<td><label>First name:</label></td>
						<td><input type="text" name="first_name" /></td>
					</tr>

					<tr>
						<td><label>Last Name:</label></td>
						<td><input type="text" name="last_name" /></td>
					</tr>

					<tr>
						<td><label>Date Of Birth:</label></td>
						<td><input type="text" name="dob" /></td>
					</tr>

					<tr>
						<td><label>Cell number:</label></td>
						<td><input type="text" name="cellphone_no" /></td>
					</tr>
					
					<tr>
						<td><label>Email:</label></td>
						<td><input type="text" name="email" /></td>
					</tr>


					<tr>
						<td><label>gender:</label></td>
						<td><input type="text" name="gender" /></td>
					</tr>
					<tr>
						<td><label>Race:</label></td>
						<td><input type="text" name="race" /></td>
					</tr>

					<tr>
						<td><label>Ethnicity:</label></td>
						<td><input type="text" name="ethnicity" /></td>
					</tr>

					<tr>
						<td><label>Primary Language:</label></td>
						<td><input type="text" name="primary_language" /></td>
					</tr>
					
					<tr>
						<td><label>Preferred Language:</label></td>
						<td><input type="text" name="preferred_language" /></td>
					</tr>

					<tr>
						<td><label>Primary Insurance:</label></td>
						<td><input type="text" name="primary_insurance" /></td>
					</tr>
					
					<tr>
						<td><label>SSN:</label></td>
						<td><input type="text" name="ssn" /></td>
					</tr>
					

					<tr>
						<td><label>Create Date:</label></td>
						<td><input type="text" name="create_date" /></td>
					</tr>

					<tr>
						<td><label>Last Update:</label></td>
						<td><input type="text" name="last_update" /></td>
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