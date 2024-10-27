package com.bootcamp.demo_sb_restapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.bootcamp.demo_sb_restapi.controller.model.PostRequest;
import com.bootcamp.demo_sb_restapi.controller.model.Posts;

public interface PostsOperation {  

  @GetMapping(value = ("/posts"))
  Posts[] getPosts();

  @GetMapping(value = ("/posts/{postID}"))
  Posts getPost(@PathVariable String postID);

  @PostMapping(value = {"/create/post"})
  Posts createNewPost(@RequestBody PostRequest postRequest);
}
