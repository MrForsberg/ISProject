package isp.eao;

import javax.ejb.Local;

import isp.cl.Program;

@Local
public interface ProgramEAOImplLocal {
	
	public Program findProgram(String pId);
	
	public Program createProgram(Program program);

}
