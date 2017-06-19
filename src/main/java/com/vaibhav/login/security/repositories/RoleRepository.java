package com.vaibhav.login.security.repositories;

import com.vaibhav.login.security.model.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by vaibhavsrivastava on 6/18/17.
 */
@Repository("roleRepository")
public interface RoleRepository extends CrudRepository<Role, Long> {
    Role findByRole(String admin);
}
