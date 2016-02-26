package isp.eao;

import javax.ejb.Local;

import isp.cl.User;

@Local
public interface UserEAOImplLocal {
	
	public User findUser(String uId);
	
	public User createUser(User user);

}
