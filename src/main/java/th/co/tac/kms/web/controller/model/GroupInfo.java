package th.co.tac.kms.web.controller.model;

import java.io.Serializable;

public class GroupInfo implements Serializable {

	private static final long serialVersionUID = -7103888002812963632L;

	private Integer groupId;
	private String groupName;
	private String groupCode;
	private String groupType;

	public Integer getGroupId() {
		return groupId;
	}

	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getGroupCode() {
		return groupCode;
	}

	public void setGroupCode(String groupCode) {
		this.groupCode = groupCode;
	}

	public String getGroupType() {
		return groupType;
	}

	public void setGroupType(String groupType) {
		this.groupType = groupType;
	}

}
