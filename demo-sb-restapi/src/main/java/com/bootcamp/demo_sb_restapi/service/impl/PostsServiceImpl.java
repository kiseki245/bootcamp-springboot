package com.bootcamp.demo_sb_restapi.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.bootcamp.demo_sb_restapi.controller.model.Posts;
import com.bootcamp.demo_sb_restapi.enity.PostsEnity;
import com.bootcamp.demo_sb_restapi.mapper.PostsMapper;
import com.bootcamp.demo_sb_restapi.repository.PostsRepository;
import com.bootcamp.demo_sb_restapi.service.PostsService;

@Service
public class PostsServiceImpl implements PostsService{

  private static String url = "https://jsonplaceholder.typicode.com/posts";

  @Autowired
  private RestTemplate restTemplate;

  @Autowired
  private PostsMapper postsMapper;

  @Autowired
  private PostsRepository postsRepository;
  @Override
  public Posts[] getPosts(){
    
    Posts[] posts = new RestTemplate().getForObject(url, Posts[].class);
    System.out.println(Arrays.toString(posts));
    if (postsRepository.findAll().size() == 0){
      System.out.println("Table created");
      Arrays.asList(posts).stream().
      forEach(post -> {
        PostsEnity postsEnity = postsMapper.map(post);
        postsRepository.save(postsEnity);
      });
    } else {
      System.out.println("Alreadty have data!");
    }
    return new RestTemplate().getForObject(url, Posts[].class);
    }

    @Override
    public Posts getPost(Long postID){
        Posts[] postsArray = getPosts();
          for (Posts posts : postsArray) {
            if (posts.getId().equals(postID)){
              return posts;
            }
          }
          return null;
        }
    }

