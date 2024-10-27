package com.bootcamp.demo_sb_restapi.service;

import com.bootcamp.demo_sb_restapi.controller.model.PostRequest;
import com.bootcamp.demo_sb_restapi.controller.model.Posts;
import com.bootcamp.demo_sb_restapi.enity.PostsEnity;

public interface PostsService {

  Posts[] getPosts();
  
  Posts getPost(Long postID);

  PostsEnity createNewPost(Long userId, Long id, String title, String body);

}
