package com.example.demo.service.impl;

import com.example.demo.commons.converter.PostConverter;
import com.example.demo.models.dto.request.PostRequest;
import com.example.demo.models.dto.response.PostResponse;
import com.example.demo.models.entity.PostEntity;
import com.example.demo.models.repo.PostRepository;
import com.example.demo.service.PostService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService{

    @Autowired
    private PostRepository postRepository;

    @Override
    public PostResponse createPost(PostRequest request) {
        return PostConverter.entityToResponse(postRepository.save(PostConverter.requestToEntity(request)));
    }
    
}
