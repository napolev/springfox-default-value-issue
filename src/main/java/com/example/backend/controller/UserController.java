package com.example.backend.controller;

import com.example.backend.model.User;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ExampleProperty;


@RestController
@RequestMapping("/user")
@Api(value="User Controller")
public class UserController {

	/**
	 * Refernce:
	 * https://springfox.github.io/springfox/docs/snapshot/#q27
	 * https://www.baeldung.com/swagger-2-documentation-for-spring-rest-api
	 */
	@RequestMapping(value = "/stringify", method = RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value = "Stringify a User")
	@ApiImplicitParams({
		@ApiImplicitParam(
			name = "user",
			dataType = "User",
			examples = @io.swagger.annotations.Example(
				value = {
					@ExampleProperty(
						value = "{'id': 0, 'username': 'bill.gates', 'password': 'microsoft'}",
						mediaType = "application/json"
					)
				}
			)
		) 
	})
	public String stringifyUser(
		@RequestBody User user
	) {
		User userObj = new User();
		userObj.setId(user.getId());
		userObj.setUsername(user.getUsername());
		userObj.setPassword(user.getPassword());
		return userObj.toString();
	}
	
}
