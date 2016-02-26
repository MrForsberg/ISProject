package isp.eao;

import javax.ejb.Local;

import isp.cl.Answer;

@Local
public interface AnswerEAOImplLocal {
	
	public Answer findAnswer(String aId);
	
	public Answer createAnswer(Answer answer);

}
