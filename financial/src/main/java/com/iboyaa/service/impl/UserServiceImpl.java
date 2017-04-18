package com.iboyaa.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.iboyaa.dao.IUserDao;
import com.iboyaa.pojo.User;
import com.iboyaa.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {
	@Resource
	private IUserDao userDao;
	@Override
	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return this.userDao.selectByPrimaryKey(userId);
	}

}
