package com.training.bean;

public class LoginBean_Registration_ELTC063 {
	private String firstname;
	private String lastname;
	private String email;
	private String username;
	private String password;
	private String confpassword;

	public LoginBean_Registration_ELTC063() {
	}
   // assigning varaibles
	public LoginBean_Registration_ELTC063(String firstname, String lastname , String email , String password, String confpassword) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.username = username;
		this.password = password;
		this.confpassword = confpassword;
	}
   // returning values
	public String getfirstname() {
		return firstname;
	}
	// returning values
	public void setfirstname(String firstname) {
		this.firstname = firstname;
	}
	// returning values
	public String getlastname() {
		return lastname;
	}
	// returning values
	public void setlastname(String lastname) {
		this.lastname = lastname;
	}

	// returning values
	public String getemail() {
		return email;
	}
	// returning values
	public void setemail(String email) {
		this.email = email;
	}
	public String getusername() {
		return username;
	}
	// returning values
	public void setusername(String username) {
		this.username = username;
	} 
	// returning values
	public String getpassword() {
		return password;
	}
	// returning values
	public void setpassword(String password) {
		this.password = password;
	}
	// returning values	
	public String getconfpassword() {
		return confpassword;
	}
	// returning values
	public void setconfpassword(String confpassword) {
		this.confpassword = confpassword;
	}
	
	
	
	@Override
	public String toString() {
		return "LoginBean [firstname=" + firstname + ", lastname=" + lastname + ", email=" + email + ", username=" + username + ", password=" + password + ", confpassword=" + confpassword + "]";
	}

}
