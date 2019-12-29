package com.example.backend.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Entity
@NoArgsConstructor
@Getter
@Setter
@ApiModel(description="This is the User model.")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@ApiModelProperty(notes = "The database generated User ID", position = 1)
	private long id;

	@ApiModelProperty(notes = "The user username", position = 2)
	private String username;

	@ApiModelProperty(notes = "The user password", position = 3)
	private String password;

	@Override
	public String toString() {
		String result = String.format("[%d] - username: %s [pass: %s]", id, username, password);
		return result;
	}

}
