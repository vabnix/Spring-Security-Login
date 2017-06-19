package com.vaibhav.login.security.services;

import com.vaibhav.login.security.model.User;

/**
 * Created by vaibhavsrivastava on 6/18/17.
 */
public interface UserService {

    public User findUserByEmail(String email);
    public void saveUser(User user);

}
