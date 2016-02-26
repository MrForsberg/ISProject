package isp.eao;

import javax.ejb.Local;

import isp.cl.CourseTest;

@Local
public interface CourseTestEAOImplLocal {
	
	public CourseTest findCourseTest(String id);
	
	public CourseTest createCourseTest(CourseTest courseTest);
	

}
