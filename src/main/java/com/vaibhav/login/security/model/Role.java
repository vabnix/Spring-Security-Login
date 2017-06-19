package com.vaibhav.login.security.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by vaibhavsrivastava on 6/18/17.
 */
@Entity
@Table(name = Role.TABLE_NAME)
public class Role implements Serializable {

    public static final String TABLE_NAME ="user";

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "role_role_id_seq")
    @SequenceGenerator(name = "role_role_id_seq")
    @Column(name="role_id")
    private Long id;

    @Column(name="role")
    private String role;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
