package com.example.demo.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "like_table")
public class LikeEntity extends BaseEntity{
    
    @Column(name = "user_id")
    private Long userId;

    @Column(name = "post_id")
    private Long  postId;
}
