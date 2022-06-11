package com.project.bookbuy.models;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.bookbuy.models.data.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer> {
    Admin findByUsername(String username);    
}
