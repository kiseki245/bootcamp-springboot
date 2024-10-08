package com.bootcamp.demo_sb_restapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.bootcamp.demo_sb_restapi.controller.model.Posts;

public interface PostsOperation {  

  @GetMapping(value = ("/posts"))
  Posts[] getPosts();

  @GetMapping(value = ("/posts/{postID}"))
  Posts getPost(@PathVariable String postID);
}
