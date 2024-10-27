package com.bootcamp.demo_restapi2.controller;

import org.springframework.web.bind.annotation.RestController;
import com.bootcamp.demo_restapi2.mapper.AlburmMapper;
import com.bootcamp.demo_restapi2.model.Alburm;
import com.bootcamp.demo_restapi2.model.AlburmRequest;
import com.bootcamp.demo_restapi2.service.AlubrmService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class AlburmController {


@Autowired
private AlubrmService alubrmService;
@Autowired
private AlburmMapper alburmMapper;
  @GetMapping(value = "/alburm")
  public List<Alburm> getAllAlburms() {
    System.out.println("Controller received:" + alubrmService.getAllAlburms().toString());
      return alubrmService.getAllAlburms();
  }
  @GetMapping("/alburm/{id}")
  public Alburm getAlburm(@PathVariable Long id) {
      return alubrmService.getAlburm(id);
  }
  
  @PostMapping("/createalburm")
  public Alburm createAlburm(@RequestBody AlburmRequest alburmRequest) {
      Long userId = alburmRequest.getUserId(); //The method type is Alburm, map the request data to the type of Alburm
      Long id = alburmRequest.getId();
      String title = alburmRequest.getTitle();

      return alburmMapper.map(alubrmService.createAlburm(id, userId, title));
  }
  
  @PutMapping("/updatealburm")
  public void updateAlburm(@RequestParam Long id, @RequestParam String title){
    
  }
  
}
