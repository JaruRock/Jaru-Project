package th.co.tac.kms.web.dao.model;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "kms_role_perm")
public class RolePerm implements Serializable {

	private static final long serialVersionUID = 5946094456749347433L;

	@EmbeddedId
	private RolePermId rolePermId;

	public RolePermId getRolePermId() {
		return rolePermId;
	}

	public void setRolePermId(RolePermId rolePermId) {
		this.rolePermId = rolePermId;
	}

}
