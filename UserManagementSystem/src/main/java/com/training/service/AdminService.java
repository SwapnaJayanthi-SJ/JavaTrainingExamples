package com.training.service;

import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Service;

import com.training.entity.User;

@Service
public interface AdminService 
{
	public List<User> getAllUser() throws ClassNotFoundException, IOException ;

	public User getUserId(Long id) throws ClassNotFoundException, IOException;

	public User updateUser(Long id, User user) throws ClassNotFoundException, IOException;

	public void deleteUser(Long id) throws ClassNotFoundException, IOException;
}
