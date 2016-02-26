package isp.cl;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Answer")
public class Answer implements Serializable {

	private String aId;
	private String aText;
	private String aBoolean;
	private Set<QuestionAnswer> questionAnswers;

	@Column(name = "Number")
	public String getaNumber() {
		return aId;
	}

	public void setaNumber(String aId) {
		this.aId = aId;
	}

	@Column(name = "Text")
	public String getaText() {
		return aText;
	}

	public void setaText(String aText) {
		this.aText = aText;
	}

	@Column(name = "Boolean")
	public String getaBoolean() {
		return aBoolean;
	}

	public void setaBoolean(String aBoolean) {
		this.aBoolean = aBoolean;
	}
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "answer")
	public Set<QuestionAnswer> getQuestionsAnswers() {
	return questionAnswers;
	}
	public void setQuestionAnswers(Set<QuestionAnswer> questionAnswers) {
	this.questionAnswers = questionAnswers;
	}

}