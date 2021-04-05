package com.domain;

import java.util.Collection;
import java.util.Collections;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@Entity
public class User implements UserDetails{

	
	@SequenceGenerator(
			name = "user_sequence",
			sequenceName = "user_sequence",
			allocationSize = 1
	)
	@Id
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "user_sequence"
	)
	private Integer id;
	private String username;
	private String password;
	private String email;
	@Enumerated(EnumType.STRING)
	private RoleUser roleUser;
	private Boolean locked;
	private Boolean enabled;
	
	public User(String username, String password, String email, RoleUser roleUser, Boolean locked, Boolean enabled) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.roleUser = roleUser;
		this.locked = locked;
		this.enabled = enabled;
	}
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		SimpleGrantedAuthority authority = new SimpleGrantedAuthority(roleUser.name());
		return Collections.singletonList(authority);
	}
	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return username;
	}
	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return !locked;
	}
	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return enabled;
	}
	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
