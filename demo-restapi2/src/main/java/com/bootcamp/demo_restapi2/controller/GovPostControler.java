package com.bootcamp.demo_restapi2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.bootcamp.demo_restapi2.dto.GovPostDTO;

public interface GovPostControler {
  
  @GetMapping(value = "/gov/post/{id}")
  GovPostDTO getPostDTO(@PathVariable Long id);
}
