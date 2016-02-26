package isp.cl;

import java.io.Serializable;

import javax.persistence.Column;
import com.sun.istack.internal.NotNull;

public class CourseTestId implements Serializable{
	private String cId;
	private String tId;

	public CourseTestId() {
	}

	public CourseTestId(String cId, String tId) {
		this.cId = cId;
		this.tId = tId;
	}

	@Column(name = "Course_Id", nullable = false)
	@NotNull
	public String getCId() {
		return cId;
	}

	public void setCId(String cId) {
		this.cId = cId;
	}

	@Column(name = "Test_Id", nullable = false)
	@NotNull
	public String getTId() {
		return tId;
	}

	public void setTId(String tId) {
		this.tId = tId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CourseTestId))
			return false;
		CourseTestId castOther = (CourseTestId) other;
		return ((this.getCId() == castOther.getCId())
				|| (this.getCId() != null && castOther.getCId() != null && this.getCId().equals(castOther.getCId())))
				&& ((this.getTId() == castOther.getTId()) || (this.getTId() != null && castOther.getTId() != null
						&& this.getTId().equals(castOther.getTId())));
	}

	public int hashCode() {
		return super.hashCode();
	}
}
