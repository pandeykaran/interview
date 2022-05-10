package com.example.demo.web.controller;

import com.example.demo.models.dto.request.LikeRequest;
import com.example.demo.models.dto.response.LikeResponse;
import com.example.demo.service.LikeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/v1/")
public class LikeController {

    @Autowired
    private LikeService likeService;
    
    @PostMapping("performLike")
    public LikeResponse createLike(@RequestBody LikeRequest request){
        return likeService.createLike(request);
    }

}
