package com.bootcamp.demo_restapi2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.bootcamp.demo_restapi2.dto.GovAlburmDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


public interface GovAlburmController {
  
  @GetMapping(value = "/gov/db/alburm/{id}")
  GovAlburmDTO getAlburmFromDB(@PathVariable Long id);
}
