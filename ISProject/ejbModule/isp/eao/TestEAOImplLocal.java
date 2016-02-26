package isp.eao;

import javax.ejb.Local;

import isp.cl.Test;

@Local
public interface TestEAOImplLocal {
	
	public Test findTest(String tId);
	
	public Test createTest(Test test);

}
