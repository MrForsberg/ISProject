package isp.cl;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "User")
public class User implements Serializable {

	private String uEmail;
	private String uId;
	private String uName;
	private String uPersonalDate;
	private String uFirstName;
	private String uLastName;
	private Set<UserProgram> userPrograms;

	@Id
	@Column(name = "Email")
	public String getuEmail() {
		return uEmail;
	}

	public void setuEmail(String uEmail) {
		this.uEmail = uEmail;
	}

	public String getuId() {
		return uId;
	}

	public void setuId(String uId) {
		this.uId = uId;
	}

	@Column(name = "Name")
	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	@Column(name = "PersonalDate")
	public String getuPersonalDate() {
		return uPersonalDate;
	}

	public void setuPersonalDate(String uPersonalDate) {
		this.uPersonalDate = uPersonalDate;
	}

	@Column(name = "FirstName")
	public String getuFirstName() {
		return uFirstName;
	}

	public void setuFirstName(String uFirstName) {
		this.uFirstName = uFirstName;
	}

	@Column(name = "LastName")
	public String getuLastName() {
		return uLastName;
	}

	public void setuLastName(String uLastName) {
		this.uLastName = uLastName;
	}

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "user")
	public Set<UserProgram> getUserPrograms() {
		return userPrograms;
	}

	public void setUserPrograms(Set<UserProgram> userPrograms) {
		this.userPrograms = userPrograms;
	}

}