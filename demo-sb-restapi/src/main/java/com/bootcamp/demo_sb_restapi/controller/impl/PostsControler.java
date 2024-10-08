package com.bootcamp.demo_sb_restapi.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.bootcamp.demo_sb_restapi.controller.PostsOperation;
import com.bootcamp.demo_sb_restapi.controller.model.Posts;
import com.bootcamp.demo_sb_restapi.service.PostsService;

@RestController
public class PostsControler implements PostsOperation{
  
  @Autowired
  private PostsService postsService;
  
  @Override
  public Posts[] getPosts(){
    return postsService.getPosts();
  }

  @Override
  public Posts getPost(String postID){
    return postsService.getPost(Long.parseLong(postID));
  }
}
