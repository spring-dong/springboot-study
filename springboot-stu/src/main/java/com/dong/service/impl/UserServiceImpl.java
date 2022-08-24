package com.dong.service.impl;

import com.dong.dao.UserDao;
import com.dong.dao.UserMapper;
import com.dong.entiy.User;
import com.dong.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Resource
    private UserDao userDao;

    @Override
    public User getUser(Long id) {
        return userMapper.getUser(id);
    }

    @Override
    public User getUserByIdAndName(Long id, String username) {
        return userMapper.getUserByIdAndName(id,username);
    }

    @Override
    public List<User> getAll() {
        return userMapper.getAll();
    }

    @Override
    public User getUserByName(String username) {
        return userMapper.getUserByName(username);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int insertUser(User user) {
        int i = userMapper.insertUser(user);
        return i;

    }

    @Override
    public User getByUsername(String username) {
        return userDao.getByUsername(username);
    }

    @Override
    public Set<String> getRoles(String username) {
        return userDao.getRoles(username);
    }

    @Override
    public Set<String> getPermissions(String username) {
        return userDao.getPermissions(username);
    }
}
