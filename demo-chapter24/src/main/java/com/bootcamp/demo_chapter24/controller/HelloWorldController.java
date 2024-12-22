package com.bootcamp.demo_chapter24.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.bootcamp.demo_chapter24.dto.CoinDTO;


@Controller

public class HelloWorldController {

  private final String url = "https://api.coingecko.com/api/v3/coins/markets?ids=bitcoin,ethereum,tether&vs_currency=usd";
  @Autowired
  private RestTemplate restTemplate;
  @Autowired
  private CoinDTO coinDTO;
  // @GetMapping("/hello")
  // public String sayHello(Model model) {
  //     model.addAttribute("message", "Hello World !!!");
  //     return "abc"; // abc.html
  // }

  @GetMapping("/coins")
  public String getMethodName(Model model) {
      // CoinDTO[] coinlist = this.restTemplate.getForObject(url, CoinDTO[].class);
      CoinDTO coin = coinDTO.builder()
      .id("1")
      .symbol("1")
      .name("Test")
      .image("Image")
      .currentPrice(9999.9)
      .marketCap(11111L)
      .lastupdate(LocalDate.now())
      .priceChangePercentage24h(2.33)
      .marketCapChangePercentage24h(5.55)
      .build();
      
      List<CoinDTO> coinlist = new ArrayList<>();
      coinlist.add(coin);
      model.addAttribute("coinlist", coinlist);
      return "coin";
  }
  
  
}
