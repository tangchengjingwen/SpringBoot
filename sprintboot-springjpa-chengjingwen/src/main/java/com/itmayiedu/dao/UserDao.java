package com.itmayiedu.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.itmayiedu.entity.User;

public interface UserDao extends JpaRepository<User, Integer>{

}
