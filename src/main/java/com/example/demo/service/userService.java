package com.example.demo.service;

import com.example.demo.entity.user;
import org.springframework.data.domain.Page;
import java.util.List;
public interface userService {
    user save(user user);
    user update(user user);
    void delete(Integer sid);
    user findUserById(Integer id);
    List<user> findUserByName(String name);
    Page<user> findAll();
}
