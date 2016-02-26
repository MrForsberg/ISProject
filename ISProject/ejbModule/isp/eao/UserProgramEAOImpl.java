package isp.eao;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import isp.cl.UserProgram;

/**
 * Session Bean implementation class UserProgramEAOImpl
 */
@Stateless
@LocalBean
public class UserProgramEAOImpl implements UserProgramEAOImplLocal {
	@PersistenceContext(unitName = "LabEJBSql")
	private EntityManager em;
  
	
    public UserProgramEAOImpl() {
        
    }
    public UserProgram findUserProgram(String id) {
  		return em.find(UserProgram.class, id);
  	}

  	public UserProgram createUserProgram(UserProgram userProgram) {
  	em.persist(userProgram);
  	return userProgram;
  }

}