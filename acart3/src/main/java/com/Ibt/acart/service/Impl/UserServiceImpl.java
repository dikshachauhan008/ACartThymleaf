package com.Ibt.acart.service.Impl;

import java.util.List;
import java.util.Optional;

import com.Ibt.acart.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Ibt.acart.repository.UserRepository;
import com.Ibt.acart.service.AcartServiceException;
import com.Ibt.acart.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	@Override
	public List<User> userList() {
        return (List<User>) userRepository.findAll();
	}
	@Override
	public User findOne(Long id) throws AcartServiceException {
		return userRepository.findOne(id);
	}
	@Override
	public void addUser(User user) {
		userRepository.save(user);
	}
	@Override
	public String deleteUser(Long id) {

		userRepository.delete(id);
		return "User deleted";
	}
	@Override
	public String updateUser(Long id, User user) {
		userRepository.save(user);
		return "User updated successfully";
	}
	
	
}
