package com.bootcamp.demo_restapi2.infra;

import java.util.Map;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.util.UriComponentsBuilder;
@Configuration
public class ApiUtil {
  
  @Value("${api.domain}")
  String domain;


  public String getUrl(Scheme scheme, String endpoint){
    String url = UriComponentsBuilder.newInstance()
    .scheme(scheme.name())
    .host(domain)
    .path(endpoint)
    .toUriString();

    return UriComponentsBuilder.newInstance()
      .scheme(scheme.name())
      .host(domain)
      .path(endpoint)
      .toUriString();
  }

  public String getUri(Scheme scheme, String endpoint, Map<String, String> requestParam){
    return UriComponentsBuilder.newInstance()
    .scheme(scheme.name())
    .host(domain)
    .path(endpoint)
    .queryParam("", requestParam.get(""))
    .toUriString();
  }
}
