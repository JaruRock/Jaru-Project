package th.co.tac.kms.web.dao;

import org.springframework.stereotype.Repository;

/**
 * <p> SODA Project </p>
 * @version 1.0
 * @author Phongsathorn Angyarn <phongsathorn@xp-link.com>
 * @since September, 2016
 *
 */

@Repository("userDao")
public class UserDao extends AbstractDao {

	private static final long serialVersionUID = 5957582884421243943L;

//	public User findById(int id) {
//        User user = getByKey(id);
//        if(user!=null){
//            Hibernate.initialize(user.getRoleSet());
//        }
//        return user;
//    }
//	
//	public User findByUsername(String username) {
//        logger.info("Username : {}", username);
//        Criteria crit = createEntityCriteria();
//        crit.add(Restrictions.eq("username", username));
//        User user = (User) crit.uniqueResult();
//        if(user!=null){
//            Hibernate.initialize(user.getRoleSet());
//        }
//        return user;
//    }
//	
//	@SuppressWarnings("unchecked")
//    public List<User> findAllUsers() {
//        Criteria criteria = createEntityCriteria().addOrder(Order.asc("firstName"));
//        criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
//        List<User> users = (List<User>) criteria.list();
//        return users;
//    }
// 
//    public void deleteByUsername(String username) {
//        Criteria crit = createEntityCriteria();
//        crit.add(Restrictions.eq("username", username));
//        User user = (User)crit.uniqueResult();
//        delete(user);
//    }
}
