package com.example.demo.commons.converter;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.models.dto.request.PostRequest;
import com.example.demo.models.dto.response.PostResponse;
import com.example.demo.models.entity.PostEntity;

public class PostConverter {
    
    public static PostEntity requestToEntity(PostRequest request){

        PostEntity entity = new PostEntity();

        entity.setUserId(request.getUserId());
        entity.setPostContent(request.getPostContent());

        return entity;
    }

    public static PostResponse entityToResponse(PostEntity entity){

        PostResponse response = new PostResponse();

        response.setCreatedAt(entity.getCreatedAt());
        response.setUpdatedAt(entity.getUpdatedAt());
        response.setId(entity.getId());
        response.setPostContent(entity.getPostContent());
        response.setUserId(entity.getUserId());

        return response;
    }

    public static List<PostResponse> entityListToResponseList(List<PostEntity> entityList){
        
        List<PostResponse> responseList = new ArrayList<>();

        entityList.forEach(entity -> {
            responseList.add(PostConverter.entityToResponse(entity));        
        });

        return responseList;
    }
}
