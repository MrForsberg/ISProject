package isp.facade;

import javax.ejb.Local;

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

@Local
public interface FacadeLocal {
	
	public Question findQuestion(String qId);
	
	public Question createQuestion(Question question);
	
	public Test findTest(String tId);
	
	public Test createTest(Test test);
	
	public Program createProgram(Program progam);
	
	public Program findProgram(String pId);
	
	public QuestionAnswer findQuestionAnswer(String id);
	
	public QuestionAnswer createQuestionAnswer(QuestionAnswer questionAnswer);
	
	public CourseTest findCourseTest(String id);
	
	public CourseTest createCourseTest(CourseTest coursetest);
	
	public User findUser(String uId);
	
	public User createUser(User user);
	
	public ProgramCourse findProgramCourse(String id);
	
	public ProgramCourse createProgramCourse(ProgramCourse programCourse);
	
	public Course findCourse(String cId);
	
	public Course createCourse(Course course);
	
	public Answer findAnswer(String aId);
	
	public Answer createAnswer(Answer answer);
	
	public UserProgram findUserProgram(String id);
	
	public UserProgram createUserProgram(UserProgram userprogram);

}