package com.cg.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.blog.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
