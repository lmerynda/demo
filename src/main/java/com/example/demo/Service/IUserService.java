package com.example.demo.Service;

import java.util.Optional;

import java.util.List;

import com.example.demo.Transport.UserEntity;

public interface IUserService {
    List<UserEntity> getUsers();

    Optional<UserEntity> getUserByUsername(String username);

    boolean hasUserWithUsername(String username);

    UserEntity saveUser(UserEntity user);

    void deleteUser(UserEntity user);
}
