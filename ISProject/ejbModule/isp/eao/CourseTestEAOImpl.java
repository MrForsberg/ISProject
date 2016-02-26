package isp.eao;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import isp.cl.Answer;
import isp.cl.CourseTest;

/**
 * Session Bean implementation class CourseTestEAOImpl
 */
@Stateless
@LocalBean
public class CourseTestEAOImpl implements CourseTestEAOImplLocal {

	@PersistenceContext(unitName = "LabEJBSql")
	private EntityManager em;

	/**
	 * Default constructor.
	 * 
	 * @return
	 */
	public CourseTestEAOImpl() {

	}

	public CourseTest findCourseTest(String id) {
		return em.find(CourseTest.class, id);

	}

	public CourseTest createCourseTest(CourseTest courseTest) {
		em.persist(courseTest);
		return courseTest;
	}
}
