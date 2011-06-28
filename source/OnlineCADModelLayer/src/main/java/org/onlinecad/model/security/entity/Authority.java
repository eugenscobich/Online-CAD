package org.onlinecad.model.security.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.onlinecad.model.enums.AuthorityType;

@Entity
@Table(name = "Authorities")
public class Authority {

	@Id
	@GeneratedValue
	@Column(name = "Id")
	private Integer id;

	@Column(name = "Username", length = 50)
	private String username;

	@Column(name = "Authority", length = 50)
	@Enumerated(EnumType.STRING)
	private AuthorityType authority;

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

	public AuthorityType getAuthority() {
		return authority;
	}

	public void setAuthority(AuthorityType authority) {
		this.authority = authority;
	}

}
