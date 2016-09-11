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
@Table(name = "kms_user")
public class User implements Serializable {

	private static final long serialVersionUID = 3110438254016956241L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@GeneratedValue(strategy = GenerationType.AUTO, generator = "kms_user_id_seqn")
	@Column(name = "user_id", unique = true, nullable = false)
	private Integer userId;
	
	@NotEmpty
	@Column(name = "user_name", unique = true, nullable = false)
	private String username;

	@NotEmpty
	@Column(name = "password", nullable = false)
	private String password;

	@NotEmpty
	@Column(name = "first_name", nullable = false)
	private String firstName;

	@NotEmpty
	@Column(name = "last_name", nullable = false)
	private String lastName;

	@NotEmpty
	@Column(name = "email", nullable = false)
	private String email;
	
	@NotEmpty
	@Column(name = "group_code", nullable = false)
	private String groupCode;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "kms_role_user", joinColumns = { @JoinColumn(name = "user_name", referencedColumnName="user_name") }, inverseJoinColumns = {
			@JoinColumn(name = "role_code", referencedColumnName="role_code") })
	private Set<Role> roleSet = new HashSet<Role>();

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGroupCode() {
		return groupCode;
	}

	public void setGroupCode(String groupCode) {
		this.groupCode = groupCode;
	}

	public Set<Role> getRoleSet() {
		return roleSet;
	}

	public void setRoleSet(Set<Role> roleSet) {
		this.roleSet = roleSet;
	}

}
