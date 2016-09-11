package th.co.tac.kms.web.dao.model;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "kms_role_user")
public class RoleUser implements Serializable {

	private static final long serialVersionUID = 892002118543713914L;

	@EmbeddedId
	private RoleUserId roleUserId;

	public RoleUserId getRoleUserId() {
		return roleUserId;
	}

	public void setRoleUserId(RoleUserId roleUserId) {
		this.roleUserId = roleUserId;
	}

}
