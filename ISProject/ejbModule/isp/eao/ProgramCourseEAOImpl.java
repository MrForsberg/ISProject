package isp.eao;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import isp.cl.CourseTest;
import isp.cl.ProgramCourse;

/**
 * Session Bean implementation class ProgramCourseEAOImpl
 */
@Stateless
@LocalBean
public class ProgramCourseEAOImpl implements ProgramCourseEAOImplLocal {
	
	@PersistenceContext(unitName = "LabEJBSql")
	private EntityManager em;

	
    public ProgramCourseEAOImpl() {
        // TODO Auto-generated constructor stub
    }
    public ProgramCourse findProgramCourse(String id) {
		return em.find(ProgramCourse.class, id);

	}

	public ProgramCourse createProgramCourse(ProgramCourse programCourse) {
		em.persist(programCourse);
		return programCourse;
	}

}
