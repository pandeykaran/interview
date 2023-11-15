package com.example.demo.service.impl;

import com.example.demo.commons.converter.LikeConverter;
import com.example.demo.models.dto.request.LikeRequest;
import com.example.demo.models.dto.response.LikeResponse;
import com.example.demo.models.repo.LikeRepository;
import com.example.demo.models.repo.PostRepository;
import com.example.demo.service.LikeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LikeserviceImpl implements LikeService {

    @Autowired
    private LikeRepository likeRepository;

    @Autowired
    private PostRepository postRepository;

    @Override
    public LikeResponse createLike(LikeRequest request) {


        //we can also check here that the postId is existing in post table or not using post id 

        if(!postRepository.existsById(request.getPostId())){
            //throw exception
        }

        return LikeConverter.entityToResponse(likeRepository.save(LikeConverter.requestToEntity(request)));
    }

    public void foo(){
        System.out.println("hello");
    }
    
}
