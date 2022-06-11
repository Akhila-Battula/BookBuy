package com.project.bookbuy.models;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.bookbuy.models.data.Page;

public interface PageRepository extends JpaRepository<Page, Integer> {
    
    Page findBySlug(String slug);
    Page findBySlugAndIdNot(String slug, int id);
    List<Page> findAllByOrderBySortingAsc();
}