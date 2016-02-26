package isp.facade;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import isp.cl.Answer;
import isp.cl.Course;
import isp.cl.CourseTest;
import isp.cl.Program;
import isp.cl.ProgramCourse;
import isp.cl.Question;
import isp.cl.QuestionAnswer;
import isp.cl.Test;
import isp.cl.User;
import isp.cl.UserProgram;
import isp.eao.AnswerEAOImplLocal;
import isp.eao.CourseEAOImplLocal;
import isp.eao.CourseTestEAOImplLocal;
import isp.eao.ProgramCourseEAOImplLocal;
import isp.eao.ProgramEAOImplLocal;
import isp.eao.QuestionAnswerEAOImplLocal;
import isp.eao.QuestionEAOImplLocal;
import isp.eao.TestEAOImplLocal;
import isp.eao.UserEAOImplLocal;
import isp.eao.UserProgramEAOImplLocal;

/**
 * Session Bean implementation class Facade
 */
@Stateless
@LocalBean
public class Facade implements FacadeLocal {
	@EJB
	AnswerEAOImplLocal answer;
	@EJB
	CourseEAOImplLocal course;
	@EJB
	CourseTestEAOImplLocal courseTest;
	@EJB
	ProgramCourseEAOImplLocal programCourse;
	@EJB
	ProgramEAOImplLocal program;
	@EJB
	QuestionAnswerEAOImplLocal questionAnswer;
	@EJB
	QuestionEAOImplLocal question;
	@EJB
	TestEAOImplLocal test;
	@EJB
	UserEAOImplLocal user;
	@EJB
	UserProgramEAOImplLocal userProgram;

	/**
	 * Default constructor.
	 */
	public Facade() {
		// TODO Auto-generated constructor stub
	}

	public Question findQuestion(String qId) {
		return question.findQuestion(qId);
	}

	public Question createQuestion(Question question) {
		question = this.question.createQuestion(question);
		return question;
	}

	public Test findTest(String tId) {
		return test.findTest(tId);
	}

	public Test createTest(Test test) {
		test = this.test.createTest(test);
		return test;
	}

	public Program createProgram(Program progam) {
		progam = this.program.createProgram(progam);
		return progam;
	}
	public Program findProgram(String pId) {
		return program.findProgram(pId);
		}

	public QuestionAnswer findQuestionAnswer(String id) {
		return questionAnswer.findQuestionAnswer(id);
	}

	public QuestionAnswer createQuestionAnswer(QuestionAnswer questionAnswer) {
		questionAnswer = this.questionAnswer.createQuestionAnswer(questionAnswer);
		return questionAnswer;
	}

	public CourseTest findCourseTest(String id) {
		return courseTest.findCourseTest(id);
	}

	public CourseTest createCourseTest(CourseTest coursetest) {
		coursetest = this.courseTest.createCourseTest(coursetest);
		return coursetest;
	}

	public User findUser(String uId) {
		return user.findUser(uId);
	}

	public User createUser(User user) {
		user = this.user.createUser(user);
		return user;
	}

	public ProgramCourse findProgramCourse(String id) {
		return programCourse.findProgramCourse(id);
	}

	public ProgramCourse createProgramCourse(ProgramCourse programCourse) {
		programCourse = this.programCourse.createProgramCourse(programCourse);
		return programCourse;
	}

	public Course findCourse(String cId) {
		return course.findCourse(cId);
	}

	public Course createCourse(Course course) {
		course = this.course.createCourse(course);
		return course;
	}

	public Answer findAnswer(String aId) {
		return answer.findAnswer(aId);
	}

	public Answer createAnswer(Answer answer) {
		answer = this.answer.createAnswer(answer);
		return answer;
	}

	public UserProgram findUserProgram(String id) {
		return userProgram.findUserProgram(id);
	}

	public UserProgram createUserProgram(UserProgram userprogram) {
		userprogram = this.userProgram.createUserProgram(userprogram);
		return userprogram;
	}
}