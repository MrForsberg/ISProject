package isp.cl;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Questions_answers")
public class QuestionAnswer implements Serializable{

	private QuestionAnswerId id;

	private Question question;
	private Answer answer;

	@EmbeddedId
	public QuestionAnswerId getId() {
		return id;
	}

	public void setId(QuestionAnswerId id) {
		this.id = id;
	}

	@ManyToOne
	@JoinColumn(name = "Question_Id", referencedColumnName = "qId", nullable = false, insertable = false, updatable = false)
	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
 this.question = question;
 }

	@ManyToOne
	@JoinColumn(name = "Answer_Id", referencedColumnName = "aId", nullable = false, insertable = false, updatable = false)
	public Answer getAnswer() {
		return answer;
	}

	public void setAnswer(Answer answer) {
		this.answer = answer;
	}
}