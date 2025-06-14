package com.namdang.how_to_jwt.service;

import com.namdang.how_to_jwt.model.User;

public interface UserService {
    User findByUsername(String username);
    User saveUser(User user);
}
