/**
 * 
 */
package com.tyzx.ams.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.tyzx.ams.bo.User;
import com.tyzx.ams.service.UserService;
import com.tyzx.ams.util.MD5Util;


/**
 * @author wangwei
 *
 */
@RestController
@RequestMapping("/order")
public class LoginController {

	private Logger LOGGER = LoggerFactory.getLogger(LoginController.class);
	
	@Autowired
    private UserService userservice;
	
	//登录
	@RequestMapping(value="/login/{name}/{password}",method=RequestMethod.POST)
	@ResponseBody
	public String login(@PathVariable("name") String name,@PathVariable("password") String password) {
		LOGGER.debug("login");
		LOGGER.info(name+"<<<>>>"+password);
		JSONObject object = new JSONObject();
		String MD5Password = MD5Util.getMD5(password);
		User user = new User(MD5Password, name);
		user = userservice.selectUser(user);
		if(user == null){
			object.put("code", "0");
		}else{
			object.put("code","1");
			object.put("user", user);
		}
		LOGGER.info(object.toJSONString());
		return object.toJSONString();
	}
	
	@RequestMapping(value = "/postLog",method=RequestMethod.POST)
	@ResponseBody
	public String postLog(){
		LOGGER.info("postLog");
		return "222";
	}
	
}
