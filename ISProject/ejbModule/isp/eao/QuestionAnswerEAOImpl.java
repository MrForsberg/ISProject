package isp.eao;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import isp.cl.ProgramCourse;
import isp.cl.QuestionAnswer;

/**
 * Session Bean implementation class QuestionAnswerEAOImpl
 */
@Stateless
@LocalBean
public class QuestionAnswerEAOImpl implements QuestionAnswerEAOImplLocal {

	@PersistenceContext(unitName = "LabEJBSql")
	private EntityManager em;
	
    public QuestionAnswerEAOImpl() {
        // TODO Auto-generated constructor stub
    }
    
    public QuestionAnswer findQuestionAnswer(String id) {
		return em.find(QuestionAnswer.class, id);

	}

	public QuestionAnswer createQuestionAnswer(QuestionAnswer questionAnswer) {
		em.persist(questionAnswer);
		return questionAnswer;
	}

}
