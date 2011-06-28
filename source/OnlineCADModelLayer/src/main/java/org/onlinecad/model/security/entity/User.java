package org.onlinecad.model.security.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Table(name = "Users")
public class User {

	@Id
	@GeneratedValue
	@Column(name = "Id")
	private Integer id;

	@Column(name = "Username", length = 50)
	private String username;

	@Column(name = "Password", length = 50)
	private String password;

	@Column(name = "Enabled", length = 50)
	private Boolean enabled;

	@OneToMany
	@JoinColumn(name = "UserId")
	@Cascade(CascadeType.ALL)
	private List<Authority> authorities = new ArrayList<Authority>();

	// ============ Properties Section ============

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public List<Authority> getAuthorities() {
		return authorities;
	}

	public void setAuthorities(List<Authority> authorities) {
		this.authorities = authorities;
	}
}
