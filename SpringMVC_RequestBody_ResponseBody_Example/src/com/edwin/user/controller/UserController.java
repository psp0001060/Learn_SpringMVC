package com.edwin.user.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.edwin.user.vo.UserVo;

@Controller
@RequestMapping("user")
public class UserController {

	private List<UserVo> userList =new ArrayList<UserVo>();
	
	public UserController() {
		for (int i = 1; i <=5; i++) {
			UserVo uv = new UserVo();
			uv.setUserID(i);
			uv.setUserName("user"+i);
			uv.setGender(i%2);
			uv.setPhone("1380013800"+i);
			uv.setEmail("email@12"+i+".com");
			uv.setBirthday(new Date(90, 2, 23));
			uv.setPassword("123456");
			userList.add(uv);
		}
	}
	
	@RequestMapping("getUsers.do")
	@ResponseBody
	public List<UserVo> getUsers(){
		return userList;
	}
	
	/**
	 * 以POST提交方式，添加一个新用户
	 * @param vo
	 * @return
	 */
	@RequestMapping(value="addUser.do", method=RequestMethod.POST,consumes = "application/json")
	@ResponseBody
	public int addUser(@RequestBody UserVo vo){
		System.out.println(vo);
		userList.add(vo);
		return 1;
	}

}
