package com.bootcamp.demo_sb_restapi.enity;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Posts")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PostsEnity {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long userId;
  private Long Id;
  private String title;
  private String body;
}
