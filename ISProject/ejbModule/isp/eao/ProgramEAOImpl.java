package isp.eao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import isp.cl.Program;

@Stateless
public class ProgramEAOImpl implements ProgramEAOImplLocal {
	@PersistenceContext(unitName = "LabEJBSql")
	private EntityManager em;

	public ProgramEAOImpl() {
	}

	public Program findProgram(String pId) {
		return em.find(Program.class, pId);
	}

	public Program createProgram(Program program) {
	em.persist(program);
	return program;
}
}
