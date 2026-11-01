package com.example.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.models.User;

public class UserService {

    private Map<Integer,User> map ;

    public UserService() {

        this.map = new HashMap<>();
    }

    public User saveUser(User user) {

        return map.putIfAbsent(user.getId(), user);
    }

    public List<User> getAllUsers() {

        return new java.util.ArrayList<>(map.values());
    }

    public User getUser(Integer id) { 

        return map.getOrDefault(id, null);
    }

}
