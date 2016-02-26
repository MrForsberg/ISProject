package isp.eao;

import javax.ejb.Local;

import isp.cl.Course;

@Local
public interface CourseEAOImplLocal {
	
	public Course findCourse(String cId);
	
	public Course createCourse(Course course);

}
