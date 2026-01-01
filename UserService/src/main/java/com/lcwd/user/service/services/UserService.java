package com.lcwd.user.service.services;

import com.lcwd.user.service.entities.User;

import java.util.List;

public interface UserService {
    //user operations

    //create
    User saveUser(User user);

    //get all user
    List<User> getAlluser();

    //get single user of given userId
    User getUser(String userId);

    //TODO : delete
 //   User deleteUser(String userId);

    //TODO:update
   // User updateUser(String userId);
}
