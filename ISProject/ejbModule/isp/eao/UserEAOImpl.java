package isp.eao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import isp.cl.User;

@Stateless
public class UserEAOImpl implements UserEAOImplLocal {
	@PersistenceContext(unitName = "LabEJBSql")
	private EntityManager em;

	public UserEAOImpl() {
	}

	public User findUser(String uId) {
		return em.find(User.class, uId);
	}

	public User createUser(User user) {
		em.persist(user);
		return user;
	}
}
