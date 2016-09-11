package th.co.tac.kms.web.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.springframework.stereotype.Repository;

import th.co.tac.kms.web.dao.model.Group;

@Repository("groupDao")
public class GroupDao extends AbstractDao<Integer, Group> {

	public List<Group> findAll() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("groupId"));
		@SuppressWarnings("unchecked")
		List<Group> groupList = (List<Group>) criteria.list();
		return groupList;
	}

}
