package jas.el.sms.model;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

public class Cadet implements Serializable {
	@NotEmpty
	@NotNull
	@Size(max = 20)
	private String cadetId;
	@Size(max = 10)
	private String nic;
	@Size(max = 30)
	@NotEmpty
	private String initalntake;
	@NotEmpty
	@NotNull
	@Size(max = 100)
	private String fullName;
	@Size(min = 1, max = 10)
	@NotEmpty
	private String initials;
	@Size(max = 50)
	@NotEmpty
	private String surname;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Past
	@NotNull
	private Date dob;
	@Size(max = 50)
	@NotEmpty
	private String recruiteType;
	@Size(max = 50)
	@NotEmpty
	private String wing;
	private Date startDate;
	private Date endDate;
	private char status;
	@Size(max = 150)
	@NotEmpty
	private String address;
	@Size(max = 10)
	private String homePhone;
	@Size(max = 15)
	@NotEmpty
	private String mobile1;
	@Size(max = 15)
	private String mobile2;
	@Email
	private String email;

	public String getCadetId() {
		return cadetId;
	}

	public void setCadetId(String cadetId) {
		this.cadetId = cadetId;
	}

	public String getNic() {
		return nic;
	}

	public void setNic(String nic) {
		this.nic = nic;
	}

	public String getInitalntake() {
		return initalntake;
	}

	public void setInitalntake(String initalntake) {
		this.initalntake = initalntake;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
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

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getRecruiteType() {
		return recruiteType;
	}

	public void setRecruiteType(String recruiteType) {
		this.recruiteType = recruiteType;
	}

	public String getWing() {
		return wing;
	}

	public void setWing(String wing) {
		this.wing = wing;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public char getStatus() {
		return status;
	}

	public void setStatus(char status) {
		this.status = status;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getHomePhone() {
		return homePhone;
	}

	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}

	public String getMobile1() {
		return mobile1;
	}

	public void setMobile1(String mobile1) {
		this.mobile1 = mobile1;
	}

	public String getMobile2() {
		return mobile2;
	}

	public void setMobile2(String mobile2) {
		this.mobile2 = mobile2;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Cadet [cadetId=" + cadetId + ", nic=" + nic + ", initalntake=" + initalntake + ", fullName=" + fullName
				+ ", initials=" + initials + ", surname=" + surname + ", dob=" + dob + ", recruiteType=" + recruiteType
				+ ", wing=" + wing + ", startDate=" + startDate + ", endDate=" + endDate + ", status=" + status
				+ ", address=" + address + ", homePhone=" + homePhone + ", mobile1=" + mobile1 + ", mobile2=" + mobile2
				+ ", email=" + email + "]";
	}

}
