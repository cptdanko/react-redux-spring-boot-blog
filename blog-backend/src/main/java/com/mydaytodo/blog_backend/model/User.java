package com.mydaytodo.blog_backend.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {

    private Date lastLogin;
    // username is email which will be the login id
    private String username;
    private String password;
    private String email;
}
