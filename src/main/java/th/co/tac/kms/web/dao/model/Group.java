package th.co.tac.kms.web.dao.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "kms_group")
public class Group implements Serializable {

	private static final long serialVersionUID = -5941510052407537635L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@GeneratedValue(strategy = GenerationType.AUTO, generator = "kms_group_id_seqn")
	@Column(name = "group_id", unique = true, nullable = false)
	private Integer groupId;
	
	@NotEmpty
	@Column(name = "group_name", unique = true, nullable = false)
	private String groupName;
	
	@NotEmpty
	@Column(name = "group_code", unique = true, nullable = false)
	private String groupCode;
	
	@NotEmpty
	@Column(name = "group_type", nullable = false)
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
