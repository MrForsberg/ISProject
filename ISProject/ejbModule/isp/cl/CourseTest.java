package isp.cl;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Courses_tests")
public class CourseTest {

	private CourseTestId id;

	private Course course;
	private Test test;

	@EmbeddedId
	public CourseTestId getId() {
		return id;
	}

	public void setId(CourseTestId id) {
		this.id = id;
	}

	@ManyToOne
	@JoinColumn(name = "Course_Id", referencedColumnName = "cId", nullable = false, insertable = false, updatable = false)
	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@ManyToOne
	@JoinColumn(name = "Test_Id", referencedColumnName = "tId", nullable = false, insertable = false, updatable = false)
	public Test getTest() {
		return test;
	}

	public void setTest(Test test) {
		this.test = test;
	}
}