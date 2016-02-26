package isp.eao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import isp.cl.Test;

@Stateless
public class TestEAOImpl implements TestEAOImplLocal {
	@PersistenceContext(unitName = "LabEJBSql")
	private EntityManager em;

	public TestEAOImpl() {
	}

	public Test findTest(String tId) {
		return em.find(Test.class, tId);
	}

	public Test createTest(Test test) {
		em.persist(test);
		return test;
	}
}
