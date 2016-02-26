package isp.cl;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Programs_courses")
public class ProgramCourse {

	private ProgramCourseId id;

	private Program program;
	private Course course;

	@EmbeddedId
	public ProgramCourseId getId() {
		return id;
	}

	public void setId(ProgramCourseId id) {
		this.id = id;
	}

	@ManyToOne
	@JoinColumn(name = "Program_Id", referencedColumnName = "tId", nullable = false, insertable = false, updatable = false)
	public Program getProgram() {
		return program;
	}

	public void setProgram(Program program) {
		this.program = program;
	}

	@ManyToOne
	@JoinColumn(name = "Course_Id", referencedColumnName = "cId", nullable = false, insertable = false, updatable = false)
	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}
}