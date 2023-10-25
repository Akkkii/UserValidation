package com.techno.signia.validation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techno.signia.validation.dto.UserRequest;
import com.techno.signia.validation.entity.User;
import com.techno.signia.validation.exception.UserNotFoundException;
import com.techno.signia.validation.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;


    public User saveUser(UserRequest userRequest) {
        User user = User.
                build(0, userRequest.getName(), userRequest.getEmail(),
                        userRequest.getMobile(), userRequest.getGender(), userRequest.getAge(), userRequest.getNationality());
        return repository.save(user);
    }


    public List<User> getAllUsers() {
        return repository.findAll();
    }


    public User getUser(int id) throws UserNotFoundException {
        User user= repository.findByUserId(id);
        if(user!=null){
            return user;
        }else{
            throw new UserNotFoundException("User not found with id : "+id);
        }
    }
}
