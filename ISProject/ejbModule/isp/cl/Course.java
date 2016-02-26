package isp.cl;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Course")
public class Course implements Serializable {

	private String cId;
	private String cName;
	private String cSemester;
	private Set<ProgramCourse> programCourses;
	private Set <CourseTest> courseTests;

	@Column(name = "Id")
	public String getcId() {
		return cId;
	}

	public void setcId(String cId) {
		this.cId = cId;
	}

	@Column(name = "Name")
	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	@Column(name = "Semester")
	public String getcSemester() {
		return cSemester;
	}

	public void setcSemester(String cSemester) {
		this.cSemester = cSemester;
	}

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "course")
	public Set<ProgramCourse> getProgramCourses() {
		return programCourses;
	}

	public void setProgramCourses(Set<ProgramCourse> programCourses) {
		this.programCourses = programCourses;

	}
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "course")
	public Set<CourseTest> getCourseTests() {
	return courseTests;
	}
	public void setCourseTests(Set<CourseTest> CourseTests) {
	this.courseTests = courseTests;
	}

}