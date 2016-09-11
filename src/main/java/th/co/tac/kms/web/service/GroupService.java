package th.co.tac.kms.web.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import th.co.tac.kms.web.controller.model.GroupInfo;
import th.co.tac.kms.web.dao.GroupDao;
import th.co.tac.kms.web.dao.model.Group;

@Service("groupService")
@Transactional
public class GroupService {

	@Autowired
	private GroupDao groupDao;
	
	public List<GroupInfo> findAll() {
		List<GroupInfo> groupInfoList = new ArrayList<GroupInfo>();
		List<Group> groupList = groupDao.findAll();
		for (Group group : groupList) {
			groupInfoList.add(fromGroup(group));
		}
		
		return groupInfoList;
	}
	
	private GroupInfo fromGroup(Group group) {
		GroupInfo groupInfo = new GroupInfo();
		groupInfo.setGroupId(group.getGroupId());
		groupInfo.setGroupName(group.getGroupName());
		groupInfo.setGroupCode(group.getGroupCode());
		groupInfo.setGroupType(group.getGroupType());
		return groupInfo;
	}
	
}
