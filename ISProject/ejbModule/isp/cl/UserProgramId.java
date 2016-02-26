package isp.cl;

import javax.persistence.Column;

import com.sun.istack.internal.NotNull;

public class UserProgramId {

	private String uId;
	private String pId;

	public UserProgramId() {
	}

	public UserProgramId(String uId, String pId) {
		this.uId = uId;
		this.pId = pId;
	}

	@Column(name = "User_Id", nullable = false)
	@NotNull
	public String getUId() {
		return uId;
	}

	public void setUId(String uId) {
		this.uId = uId;
	}

	@Column(name = "Program_Id", nullable = false)
	@NotNull
	public String getPId() {
		return pId;
	}

	public void setPId(String pId) {
		this.pId = pId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof UserProgramId))
			return false;

		UserProgramId castOther = (UserProgramId) other;

		return ((this.getUId() == castOther.getUId())
				|| (this.getUId() != null && castOther.getUId() != null && this.getUId().equals(castOther.getUId())))
				&& ((this.getPId() == castOther.getPId()) || (this.getPId() != null && castOther.getPId() != null
						&& this.getPId().equals(castOther.getPId())));
	}

	public int hashCode() {
		return super.hashCode();
	}
}