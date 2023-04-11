package net.javaguides.springboot.services;

import net.javaguides.springboot.entity.User;

import java.util.List;

public interface UserService {
    User CreateUser(User user);
    User getById(Long userId);

    User createUser(User user);

    User getUserById(Long userId);

    List<User> getAllUsers();
    void deleteUser(Long userId);
}
