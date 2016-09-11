package th.co.tac.kms.web.dao.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.hibernate.validator.constraints.NotEmpty;

@Embeddable
public class RoleUserId implements Serializable {

	private static final long serialVersionUID = 2334040965609726969L;

	@NotEmpty
	@Column(name = "role_code", nullable = false)
	private String roleCode;
	
	@NotEmpty
	@Column(name = "user_name", nullable = false)
	private String username;

	public String getRoleCode() {
		return roleCode;
	}

	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "M2MRoleUserId [roleCode=" + roleCode + ", username=" + username + "]";
	}
	
}
