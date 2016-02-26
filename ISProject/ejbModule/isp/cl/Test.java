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
@Table(name="Test")
public class Test implements Serializable{
 
 private String tId;
 private String tResult;
 private Set <Question> questions;
 
 @Id
 @Column(name="Id")
 public String getdId() {
  return tId;
 }
 public void setdId(String tId) {
  this.tId = tId;
 }
 @Column(name="Result")
 public String gettResult() {
  return tResult;
 }
 public void settResult(String tResult) {
  this.tResult = tResult;
 }
 
 @OneToMany(fetch = FetchType.EAGER, mappedBy = "test")
	public Set<Question> getQuestions() {
	return questions;
	}
	public void setQuestions(Set<Question> questions) {
	this.questions = questions;
}
}