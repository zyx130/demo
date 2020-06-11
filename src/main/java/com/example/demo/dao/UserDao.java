package com.example.demo.dao;

import com.example.demo.entity.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserDao extends JpaRepository<user,Integer> {

    UserDao findUserById(Integer id);

    @Query(name = "findUserByName",nativeQuery = true,value =
            "select * from user where name=:name")
    List<UserDao> findUserByName(@Param("name") String name);
}
