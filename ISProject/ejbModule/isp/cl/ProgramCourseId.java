package isp.cl;

import java.io.Serializable;

import javax.persistence.Column;
import com.sun.istack.internal.NotNull;

public class ProgramCourseId implements Serializable{
	private String pId;
	private String cId;

	public ProgramCourseId() {
	}

	public ProgramCourseId(String pId, String cId) {
		this.pId = pId;
		this.cId = cId;
	}

	@Column(name = "Program_Id", nullable = false)
	@NotNull
	public String getPId() {
		return pId;
	}

	public void setPId(String pId) {
		this.pId = pId;
	}

	@Column(name = "Course_Id", nullable = false)
	@NotNull
	public String getCId() {
		return cId;
	}

	public void setCId(String cId) {
		this.cId = cId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ProgramCourseId))
			return false;
		ProgramCourseId castOther = (ProgramCourseId) other;
		return ((this.getPId() == castOther.getPId())
				|| (this.getPId() != null && castOther.getPId() != null && this.getPId().equals(castOther.getPId())))
				&& ((this.getCId() == castOther.getCId()) || (this.getCId() != null && castOther.getCId() != null
						&& this.getCId().equals(castOther.getCId())));
	}

	public int hashCode() {
		return super.hashCode();
	}
}
