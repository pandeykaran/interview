package com.example.demo.commons.converter;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.models.dto.request.LikeRequest;
import com.example.demo.models.dto.response.LikeResponse;
import com.example.demo.models.entity.LikeEntity;

public class LikeConverter {
    
    public static LikeEntity requestToEntity(LikeRequest request){
        LikeEntity entity = new LikeEntity();

        entity.setPostId(request.getPostId());
        entity.setUserId(request.getUserId());

        return entity;
    }

    public static LikeResponse entityToResponse(LikeEntity entity){
        LikeResponse response = new LikeResponse();

        response.setCreatedAt(entity.getCreatedAt());
        response.setId(entity.getId());
        response.setPostId(entity.getPostId());
        response.setUserId(entity.getUserId());
        response.setUpdatedAt(entity.getUpdatedAt());

        return response;
    }

    public static List<LikeResponse> listOfEntityToListOfResponse(List<LikeEntity> entityList){
        
        List<LikeResponse> responseList = new ArrayList<>();

        entityList.forEach(entity -> {
            responseList.add((LikeConverter.entityToResponse(entity)));
        });

        return responseList;
    }
}
