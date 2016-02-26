package isp.eao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import isp.cl.Course;

@Stateless
public class CourseEAOImpl implements CourseEAOImplLocal {
	@PersistenceContext(unitName = "LabEJBSql")
	private EntityManager em;

	public CourseEAOImpl() {
	}

	public Course findCourse(String cId) {
		return em.find(Course.class, cId);
	}

	public Course createCourse(Course course) {
	em.persist(course);
	return course;
}
}
