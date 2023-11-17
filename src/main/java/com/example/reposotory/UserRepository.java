package com.example.reposotory;

import com.example.model.User;

import java.util.*;


public class UserRepository {

    private List<User> users = new ArrayList<>();

    public UserRepository() {
        users.add(new User("Petya", "123Petya", List.of(Authorities.DELETE, Authorities.WRITE)));
        users.add(new User("Anya", "123Anya", List.of(Authorities.READ)));
    }

    public List<Authorities> getUserAuthorities(String user, String password) {

        for (User user1 : users) {
            if (user1.getUser().equals(user) && user1.getPassword().equals(password)) {
                return user1.getAuthorities();
            }
        }

        return Collections.emptyList();
    }
}
