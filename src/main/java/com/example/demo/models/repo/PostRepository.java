package com.example.demo.models.repo;

import com.example.demo.models.entity.PostEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<PostEntity,Long>{
    
}
