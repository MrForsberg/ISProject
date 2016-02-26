package isp.cl;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Question")
public class Question implements Serializable{
 
 private String qId;
 private String qText;
 private Test test;
 private Set<QuestionAnswer> questionAnswers;

 
 @Id
 @Column(name="Number")
 public String getqNumber() {
  return qId;
 }
 public void setqNumber(String qId) {
  this.qId = qId;
 }
 @Column(name="Text")
 public String getqText() {
  return qText;
 }
 public void setqText(String qText) {
  this.qText = qText;
 }
 @ManyToOne
	@JoinColumn(name = "Test_Id", referencedColumnName = "id", nullable = false, insertable = false, updatable = false)
	public Test getTest() {
		return test;
	}

	public void setTest(Test test) {
		this.test = test;
	}
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "question")
	public Set<QuestionAnswer> getQuestionsAnswers() {
	return questionAnswers;
	}
	public void setQuestionAnswers(Set<QuestionAnswer> questionAnswers) {
	this.questionAnswers = questionAnswers;
	}
 

}