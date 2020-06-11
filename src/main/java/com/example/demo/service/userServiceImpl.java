package com.example.demo.service;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userServiceImpl implements userService {

    @Autowired
    UserDao userDao;

    @Override
    public user save(user user) {
        return userDao.save(user);
    }

    @Override
    public user update(user user) {
        return userDao.save(user);//调用save如果传入的id已经存在那么会把之前的信息进行覆盖。
    }

    @Override
    public void delete(Integer sid) {
        userDao.deleteById(sid);
    }

    @Override
    public user findUserById(Integer sid) {
        return userDao.findUserById(sid);
    }

    @Override
    public List<user> findUserByName(String name) {
        return userDao.findUserByName(name);
    }

    @Override
    public Page<user> findAll() {
        return userDao.findAll();
    }
}

