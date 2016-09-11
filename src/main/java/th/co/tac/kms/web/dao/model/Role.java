package th.co.tac.kms.web.dao.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "kms_role")
public class Role implements Serializable {

	private static final long serialVersionUID = 2452626476810747075L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@GeneratedValue(strategy = GenerationType.AUTO, generator = "kms_role_id_seqn")
	@Column(name = "role_id", unique = true, nullable = false)
	private Integer roleId;
	
	@NotEmpty
	@Column(name = "role_name", unique = true, nullable = false)
	private String roleName;
	
	@NotEmpty
	@Column(name = "role_code", nullable = false)
	private String roleCode;
	
	@NotEmpty
	@Column(name = "group_code", nullable = false)
	private String groupCode;

	@NotEmpty
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "kms_role_perm", joinColumns = { @JoinColumn(name = "role_code", referencedColumnName="role_code") }, inverseJoinColumns = {
			@JoinColumn(name = "perm_code", referencedColumnName="perm_code") })
	private Set<Permission> permSet = new HashSet<Permission>();

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleCode() {
		return roleCode;
	}

	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}

	public String getGroupCode() {
		return groupCode;
	}

	public void setGroupCode(String groupCode) {
		this.groupCode = groupCode;
	}

	public Set<Permission> getPermSet() {
		return permSet;
	}

	public void setPermSet(Set<Permission> permSet) {
		this.permSet = permSet;
	}

}
