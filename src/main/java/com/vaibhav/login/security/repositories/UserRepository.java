package com.vaibhav.login.security.repositories;

import com.vaibhav.login.security.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by vaibhavsrivastava on 6/18/17.
 */
@Repository("userRepository")
public interface UserRepository extends CrudRepository<User, Long> {
    User findByEmail(String email);
}
