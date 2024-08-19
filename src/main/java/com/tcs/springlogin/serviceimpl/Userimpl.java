package com.tcs.springlogin.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.springlogin.dao.Userdao;
import com.tcs.springlogin.service.UserService;
@Service
public class Userimpl implements UserService {
	@Autowired
	Userdao ud;

}
