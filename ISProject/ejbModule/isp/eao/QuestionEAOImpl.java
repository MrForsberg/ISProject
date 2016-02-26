package isp.eao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import isp.cl.Question;

@Stateless
public class QuestionEAOImpl implements QuestionEAOImplLocal {
	@PersistenceContext(unitName = "LabEJBSql")
	private EntityManager em;

public QuestionEAOImpl() {}

	public Question findQuestion(String qId) {
		return em.find(Question.class, qId);
	}

	public Question createQuestion(Question question) {
		em.persist(question);
		return question;
	}
}
