package com.bootcamp.demo_sb_restapi.mapper;

import org.springframework.stereotype.Component;
import com.bootcamp.demo_sb_restapi.controller.model.Posts;
import com.bootcamp.demo_sb_restapi.enity.PostsEnity;

@Component
public class PostsMapper {
  public PostsEnity map(Posts posts){
    return PostsEnity.builder()
    .userId(posts.getUserId())
    .Id(posts.getId())
    .title(posts.getTitle())
    .body(posts.getBody())
    .build();
  }
}
