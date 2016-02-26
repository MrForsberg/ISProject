package isp.cl;

import javax.persistence.Column;
import com.sun.istack.internal.NotNull;

public class QuestionAnswerId {
	private String qId;
	private String aId;

	public QuestionAnswerId() {
	}

	public QuestionAnswerId(String qId, String aId) {
		this.qId = qId;
		this.aId = aId;
	}

	@Column(name = "Question_Id", nullable = false)
	@NotNull
	public String getQId() {
		return qId;
	}

	public void setQId(String qId) {
		this.qId = qId;
	}

	@Column(name = "Answer_Id", nullable = false)
	@NotNull
	public String getAId() {
		return aId;
	}

	public void setAId(String aId) {
		this.aId = aId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof QuestionAnswerId))
			return false;
		QuestionAnswerId castOther = (QuestionAnswerId) other;
		return ((this.getQId() == castOther.getQId())
				|| (this.getQId() != null && castOther.getQId() != null && this.getQId().equals(castOther.getQId())))
				&& ((this.getAId() == castOther.getAId()) || (this.getAId() != null && castOther.getAId() != null
						&& this.getAId().equals(castOther.getAId())));
	}

	public int hashCode() {
		return super.hashCode();
	}
}