package com.bootcamp.demo_sb_restapi.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.bootcamp.demo_sb_restapi.controller.PostsOperation;
import com.bootcamp.demo_sb_restapi.controller.model.PostRequest;
import com.bootcamp.demo_sb_restapi.controller.model.Posts;
import com.bootcamp.demo_sb_restapi.mapper.PostsMapper;
import com.bootcamp.demo_sb_restapi.service.PostsService;

@RestController
public class PostsControler implements PostsOperation{
  
  @Autowired
  private PostsService postsService;
  @Autowired
  private PostsMapper postMapping;
  @Override
  public Posts[] getPosts(){
    return postsService.getPosts();
  }

  @Override
  public Posts getPost(String postID){
    return postsService.getPost(Long.parseLong(postID));
  }

  @Override
  public Posts createNewPost(PostRequest postRequest){
     Long userId = postRequest.getUserId();
     System.out.println("In Controller, UserId" + userId);
     Long id = postRequest.getId();
     System.out.println("In Controller, Id" + id);
     String title = postRequest.getTitle();
     System.out.println("In Controller, title" + title);
     String body = postRequest.getBody();
     System.out.println("In Controller, body" + body);

    return postMapping.map(postsService.createNewPost(userId, id, title, body));
  }
}
