package com.mercury.FinalProject.bean;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;


@Entity
@Table(name = "FINAL_USER_PROFILE")
public class UserProfile implements GrantedAuthority{

	@Id
	private int id;
	@Column
	private String type;


	public UserProfile(){

	}

	public UserProfile(int id){
		this.id = id;
	}

	public UserProfile(int id, String type) {
		this.id = id;
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}


	@Override
	public String toString() {
		return "UserProfile{" +
				"id=" + id +
				", type='" + type + '\'' +
				'}';
	}

	@Override
	public String getAuthority() {
		return type;
	}
}
