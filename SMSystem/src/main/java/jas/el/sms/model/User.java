package jas.el.sms.model;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;

public class User implements Serializable {
	@NotEmpty
	@NotNull
	@Size(max = 20)
	private String id;
	@Size(min = 1, max = 10)
	@NotEmpty
	private String initials;
	@Size(max = 50)
	@NotEmpty
	private String surname;
	@Size(max = 20)
	@NotEmpty
	private String userType;
	@Size(max = 30)
	@NotEmpty
	private String userName;
	@Size(max = 30)
	@NotEmpty
	private String password;
	@Size(max=100)
	private String SecAnswer;
	@Size(max = 1)
	private String status;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getInitials() {
		return initials;
	}

	public void setInitials(String initials) {
		this.initials = initials;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSecAnswer() {
		return SecAnswer;
	}

	public void setSecAnswer(String secAnswer) {
		SecAnswer = secAnswer;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", initials=" + initials + ", surname=" + surname + ", userType=" + userType
				+ ", userName=" + userName + ", password=" + password + ", SecAnswer=" + SecAnswer + ", status="
				+ status + "]";
	}
	
	

}
