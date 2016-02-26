package isp.eao;

import javax.ejb.Local;

import isp.cl.UserProgram;

@Local
public interface UserProgramEAOImplLocal {
	

    public UserProgram findUserProgram(String id);
    public UserProgram createUserProgram(UserProgram userProgram);

}
