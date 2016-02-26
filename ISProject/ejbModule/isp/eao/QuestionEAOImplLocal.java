package isp.eao;

import javax.ejb.Local;

import isp.cl.Question;

@Local
public interface QuestionEAOImplLocal {
	
	public Question findQuestion(String qId);
	
	public Question createQuestion(Question question);

}
