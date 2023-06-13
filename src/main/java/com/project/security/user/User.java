package com.project.security.user;

import lombok.Data;

@Data // Getter and setters
public class User {

    private Integer id;

    private String firstName;

    private String lastName;

    private String email;

    private String password;

}
