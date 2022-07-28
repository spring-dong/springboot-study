package com.dong.service;

import com.dong.entiy.User;


import java.util.List;
import java.util.Set;

public interface UserService {


    User getUser(Long id);


    User getUserByIdAndName( Long id,  String username);


    List<User> getAll();


    User getUserByName(String username);

    int insertUser(User user);

    User getByUsername(String username);

    Set<String> getRoles(String username);

    Set<String> getPermissions(String username);
}
