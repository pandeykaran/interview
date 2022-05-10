package com.example.demo.web.controller;

import com.example.demo.models.dto.request.PostRequest;
import com.example.demo.models.dto.response.PostResponse;
import com.example.demo.models.entity.PostEntity;
import com.example.demo.service.PostService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/v1")
public class PostController {

    @Autowired
    private PostService postService;
    
    @PostMapping("createPost")
    public PostResponse createPost(@RequestBody PostRequest request){

        return postService.createPost(request);
    }

}
