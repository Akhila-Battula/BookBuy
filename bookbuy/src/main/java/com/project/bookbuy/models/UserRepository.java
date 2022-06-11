package com.project.bookbuy.models;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.bookbuy.models.data.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUsername(String username);
}
