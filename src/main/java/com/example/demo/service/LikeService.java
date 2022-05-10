package com.example.demo.service;

import com.example.demo.models.dto.request.LikeRequest;
import com.example.demo.models.dto.response.LikeResponse;

public interface LikeService {

    LikeResponse createLike(LikeRequest request);
    
}
