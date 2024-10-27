package com.bootcamp.demo_simple_calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import com.bootcamp.demo_simple_calculator.model.APIReponse;
import com.bootcamp.demo_simple_calculator.model.APIRequest;
import jakarta.websocket.server.PathParam;

public interface Calculater {
  

  @GetMapping(value = "/operation")
  APIRequest apiRequest2(@RequestParam String x, String y, String operation);

  @GetMapping(value = "/operation/{x}/{y}/{operation}")
  APIRequest apiRequest(@PathVariable String x, String y, String operation);

  @PostMapping(value = "/operation")
  APIReponse apiReponse(@RequestBody APIRequest apiRequest);
}
