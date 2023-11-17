package com.example.model;

import com.example.reposotory.Authorities;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.List;

public class User {
    @NotNull
    @Size(min = 2, max = 25)
    private String user;

    @NotNull
    @Size(min = 6, max = 12)
    private String password;

    private List<Authorities> authorities;

    public User(String user, String password, List<Authorities> authorities) {
        this.user = user;
        this.password = password;
        this.authorities = authorities;
    }

    public User() {
    }

    public List<Authorities> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(List<Authorities> authorities) {
        this.authorities = authorities;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
