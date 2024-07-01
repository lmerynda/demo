package com.example.demo.Security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.Service.IUserService;
import com.example.demo.Transport.UserData;
import com.example.demo.Transport.UserEntity;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    private final IUserService userService;

    public UserDetailsServiceImpl(IUserService userService)
    {
        this.userService = userService;
    }

    @Override
    public UserDetails loadUserByUsername(String username) {
        UserEntity user = userService.getUserByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException(String.format("Username %s not found", username)));
        return mapUserToCustomUserDetails(user);
    }

    private UserData mapUserToCustomUserDetails(UserEntity user) {
        UserData userData = new UserData(user.username, user.password);
        return userData;
    }
}
