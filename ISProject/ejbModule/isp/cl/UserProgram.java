package isp.cl;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Users_programs")
public class UserProgram implements Serializable{

	private UserProgramId id;

	private User user;
	private Program program;

	@EmbeddedId
	public UserProgramId getId() {
		return id;
	}

	public void setId(UserProgramId id) {
		this.id = id;
	}

	@ManyToOne
	@JoinColumn(name = "User_Id", referencedColumnName = "uId", nullable = false, insertable = false, updatable = false)
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@ManyToOne
	@JoinColumn(name = "Program_Id", referencedColumnName = "pId", nullable = false, insertable = false, updatable = false)
	public Program getProgram() {
		return program;
	}

	public void setProgram(Program program) {
		this.program = program;
	}
}