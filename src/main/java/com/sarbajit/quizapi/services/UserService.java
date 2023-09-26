package com.sarbajit.quizapi.services;

import com.sarbajit.quizapi.model.User;
import com.sarbajit.quizapi.model.userRole;

import java.util.Set;

public interface UserService {
    public User createUser(User user, Set<userRole> userRoles) throws Exception;
    public User getUser(String uname);
    public void deleteUser(Long userId);
}
