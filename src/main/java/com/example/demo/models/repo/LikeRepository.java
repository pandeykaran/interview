package com.example.demo.models.repo;

import com.example.demo.models.entity.LikeEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LikeRepository extends JpaRepository<LikeEntity,Long>{
    
}
