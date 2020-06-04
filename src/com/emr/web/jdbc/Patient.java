package com.emr.web.jdbc;

public class Patient {
private int id;
private String first_name;
private String last_name;
private String dob;
private String cellphone_no;
private String email;
private String gender;
private String race;
private String ethnicity;
private String primary_language;
private String preferred_language;
private String primary_insurance;
private String ssn;
private String create_date;
private String last_update;


public Patient(int id, String first_name, String last_name, String dob, String cellphone_no, String email,
		String gender, String race, String ethnicity, String primary_language, String preferred_language,
		String primary_insurance, String ssn, String create_date, String last_update) {
	this.id = id;
	this.first_name = first_name;
	this.last_name = last_name;
	this.dob = dob;
	this.cellphone_no = cellphone_no;
	this.email = email;
	this.gender = gender;
	this.race = race;
	this.ethnicity = ethnicity;
	this.primary_language = primary_language;
	this.preferred_language = preferred_language;
	this.primary_insurance = primary_insurance;
	this.ssn = ssn;
	this.create_date = create_date;
	this.last_update = last_update;
}



public Patient(String first_name, String last_name, String dob, String cellphone_no, String email, String gender,
		String race, String ethnicity, String primary_language, String preferred_language, String primary_insurance,
		String ssn, String create_date, String last_update) {

	this.first_name = first_name;
	this.last_name = last_name;
	this.dob = dob;
	this.cellphone_no = cellphone_no;
	this.email = email;
	this.gender = gender;
	this.race = race;
	this.ethnicity = ethnicity;
	this.primary_language = primary_language;
	this.preferred_language = preferred_language;
	this.primary_insurance = primary_insurance;
	this.ssn = ssn;
	this.create_date = create_date;
	this.last_update = last_update;
}


public int getId() {
	return id;
}



public void setId(int id) {
	this.id = id;
}



public String getFirst_name() {
	return first_name;
}



public void setFirst_name(String first_name) {
	this.first_name = first_name;
}



public String getLast_name() {
	return last_name;
}



public void setLast_name(String last_name) {
	this.last_name = last_name;
}



public String getDob() {
	return dob;
}



public void setDob(String dob) {
	this.dob = dob;
}



public String getCellphone_no() {
	return cellphone_no;
}



public void setCellphone_no(String cellphone_no) {
	this.cellphone_no = cellphone_no;
}



public String getEmail() {
	return email;
}



public void setEmail(String email) {
	this.email = email;
}



public String getGender() {
	return gender;
}



public void setGender(String gender) {
	this.gender = gender;
}



public String getRace() {
	return race;
}



public void setRace(String race) {
	this.race = race;
}



public String getEthnicity() {
	return ethnicity;
}



public void setEthnicity(String ethnicity) {
	this.ethnicity = ethnicity;
}



public String getPrimary_language() {
	return primary_language;
}



public void setPrimary_language(String primary_language) {
	this.primary_language = primary_language;
}



public String getPreferred_language() {
	return preferred_language;
}



public void setPreferred_language(String preferred_language) {
	this.preferred_language = preferred_language;
}



public String getPrimary_insurance() {
	return primary_insurance;
}



public void setPrimary_insurance(String primary_insurance) {
	this.primary_insurance = primary_insurance;
}



public String getSsn() {
	return ssn;
}



public void setSsn(String ssn) {
	this.ssn = ssn;
}



public String getCreate_date() {
	return create_date;
}



public void setCreate_date(String create_date) {
	this.create_date = create_date;
}



public String getLast_update() {
	return last_update;
}



public void setLast_update(String last_update) {
	this.last_update = last_update;
}



@Override
public String toString() {
	return "Patient [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", dob=" + dob
			+ ", cellphone_no=" + cellphone_no + ", email=" + email + ", gender=" + gender + ", race=" + race
			+ ", ethnicity=" + ethnicity + ", primary_language=" + primary_language + ", preferred_language="
			+ preferred_language + ", primary_insurance=" + primary_insurance + ", ssn=" + ssn + ", create_date="
			+ create_date + ", last_update=" + last_update + "]";
}






}