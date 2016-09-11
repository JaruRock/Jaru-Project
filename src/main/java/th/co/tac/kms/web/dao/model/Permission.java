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
@Table(name = "kms_permission")
public class Permission implements Serializable {

	private static final long serialVersionUID = 1766570063013132849L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@GeneratedValue(strategy = GenerationType.AUTO, generator = "kms_perm_id_seqn")
	@Column(name = "perm_id", unique = true, nullable = false)
	private Integer permId;
	
	@NotEmpty
	@Column(name = "perm_name", nullable = false)
	private String permName;
	
	@NotEmpty
	@Column(name = "perm_code", nullable = false)
	private String permCode;
	
	@Column(name = "perm_detl", nullable = true)
	private String permDetl;

	public Integer getPermId() {
		return permId;
	}

	public void setPermId(Integer permId) {
		this.permId = permId;
	}

	public String getPermName() {
		return permName;
	}

	public void setPermName(String permName) {
		this.permName = permName;
	}

	public String getPermCode() {
		return permCode;
	}

	public void setPermCode(String permCode) {
		this.permCode = permCode;
	}

	public String getPermDetl() {
		return permDetl;
	}

	public void setPermDetl(String permDetl) {
		this.permDetl = permDetl;
	}
	
}
