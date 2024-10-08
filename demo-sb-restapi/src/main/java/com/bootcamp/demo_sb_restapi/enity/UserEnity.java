package com.bootcamp.demo_sb_restapi.enity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

// Hibernate -> @Enity
@Entity // JPA help create table if not exists
@Table(name = "Users")
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserEnity {
  @Id //Primary Key
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  private String username;
  @Column(name = "useremail")
  private String email;
  private String phone;
  private String website;
}
