package com.bootcamp.demo_sb_restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.bootcamp.demo_sb_restapi.enity.PostsEnity;

@Repository
public interface PostsRepository extends JpaRepository<PostsEnity, Long>{

    
}
