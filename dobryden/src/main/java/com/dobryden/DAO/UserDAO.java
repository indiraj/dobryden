package com.dobryden.DAO;

import org.springframework.stereotype.Service;

import com.dobryden.model.UserDetails;



@Service
public interface UserDAO
{
	public boolean insert_User(UserDetails d);
}
