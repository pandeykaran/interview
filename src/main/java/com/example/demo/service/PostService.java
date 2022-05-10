package com.example.demo.service;

import com.example.demo.models.dto.request.PostRequest;
import com.example.demo.models.dto.response.PostResponse;
import com.example.demo.models.entity.PostEntity;

public interface PostService {

    PostResponse createPost(PostRequest request);
    
}
