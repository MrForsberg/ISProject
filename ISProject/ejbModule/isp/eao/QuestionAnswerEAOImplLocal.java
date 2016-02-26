package isp.eao;

import javax.ejb.Local;

import isp.cl.QuestionAnswer;

@Local
public interface QuestionAnswerEAOImplLocal {
	
	public QuestionAnswer findQuestionAnswer(String id);
	
	public QuestionAnswer createQuestionAnswer(QuestionAnswer questionAnswer);

}
