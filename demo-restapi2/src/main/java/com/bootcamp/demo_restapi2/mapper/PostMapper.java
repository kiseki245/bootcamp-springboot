package com.bootcamp.demo_restapi2.mapper;

import org.springframework.stereotype.Component;
import com.bootcamp.demo_restapi2.enity.PostEntity;
import com.bootcamp.demo_restapi2.enity.UserEntity;
import com.bootcamp.demo_restapi2.model.Posts;
import com.bootcamp.demo_restapi2.model.User;


public class PostMapper {
    public PostEntity map(Posts posts){
    return PostEntity.builder()
    .userId(posts.getUserId())
    .id(posts.getId())
    .title(posts.getTitle())
    .body(posts.getBody())
    .build();


  }
}
