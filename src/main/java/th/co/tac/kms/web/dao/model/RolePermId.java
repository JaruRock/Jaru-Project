package th.co.tac.kms.web.dao.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.hibernate.validator.constraints.NotEmpty;

@Embeddable
public class RolePermId implements Serializable {

	private static final long serialVersionUID = -8962269343750090894L;

	@NotEmpty
	@Column(name = "role_code", nullable = false)
	private String roleCode;
	
	@NotEmpty
	@Column(name = "perm_code", nullable = false)
	private String permCode;

	public String getRoleCode() {
		return roleCode;
	}

	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}

	public String getPermCode() {
		return permCode;
	}

	public void setPermCode(String permCode) {
		this.permCode = permCode;
	}
	
}
