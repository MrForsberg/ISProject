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
@Table(name="Program")
public class Program implements Serializable {
 
 private String pId;
 private String pName;
 private Set <UserProgram> userPrograms;
 private Set <ProgramCourse> programCourses;
 
 @Id
 @Column(name="Id")
 public String getpId() {
  return pId;
 }
 public void setpId(String pId) {
  this.pId = pId;
 }
 @Column(name="Name")
 public String getpName() {
  return pName;
 }
 public void setpName(String pName) {
  this.pName = pName;
 }
 
 @OneToMany(fetch = FetchType.EAGER, mappedBy = "program")
 public Set<UserProgram> getUserPrograms() {
 return userPrograms;
 }
 public void setuserPrograms(Set<UserProgram> userPrograms) {
 this.userPrograms = userPrograms;
}
 
 @OneToMany(fetch = FetchType.EAGER, mappedBy = "program")
	public Set<ProgramCourse> getProgramCourses() {
	return programCourses;
	}
	public void setProgramCourses(Set<ProgramCourse> programCourses) {
	this.programCourses = programCourses;
}
}