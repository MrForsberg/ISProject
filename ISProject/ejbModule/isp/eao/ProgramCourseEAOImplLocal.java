package isp.eao;

import javax.ejb.Local;

import isp.cl.ProgramCourse;

@Local
public interface ProgramCourseEAOImplLocal {

	public ProgramCourse findProgramCourse(String id);

	public ProgramCourse createProgramCourse(ProgramCourse programCourse);

}
