package isp.eao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import isp.cl.Answer;

@Stateless
public class AnswerEAOImpl implements AnswerEAOImplLocal {
	@PersistenceContext(unitName = "LabEJBSql")
	private EntityManager em;

	public AnswerEAOImpl() {
	}

	public Answer findAnswer(String aId) {
		return em.find(Answer.class, aId);
	}

	public Answer createAnswer(Answer answer) {
	em.persist(answer);
	return answer;
}
}
