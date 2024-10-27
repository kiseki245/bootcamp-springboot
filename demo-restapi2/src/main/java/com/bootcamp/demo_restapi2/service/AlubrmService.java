package com.bootcamp.demo_restapi2.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.bootcamp.demo_restapi2.enity.AlburmEnity;
import com.bootcamp.demo_restapi2.infra.ApiUtil;
import com.bootcamp.demo_restapi2.infra.Scheme;
import com.bootcamp.demo_restapi2.mapper.AlburmMapper;
import com.bootcamp.demo_restapi2.model.Alburm;
import com.bootcamp.demo_restapi2.repository.AlubrmRepository;

@Service
public class AlubrmService {
  

@Value("${api.endpoint.albums}")
private String endpoint;
@Autowired
private ApiUtil apiUtil;
@Autowired
private RestTemplate restTemplate;
@Autowired
private AlubrmRepository alubrmRepository;
@Autowired
private AlburmMapper alburmMapper;
  public List<Alburm> getAllAlburms(){
    
    Alburm[] alburmArr = new RestTemplate().getForObject(apiUtil.getUrl(Scheme.HTTPS, endpoint), Alburm[].class);
    List<Alburm> alburms = new ArrayList<>();
    
    for (Alburm alburm : alburmArr) {
      alburms.add(alburm);
      AlburmEnity alburmEnity = alburmMapper.map(alburm);
      alubrmRepository.save(alburmEnity);
    }

    return alburms;
  }

  public Alburm getAlburm(Long id){
    Alburm[] alburmArr = new RestTemplate().getForObject(apiUtil.getUrl(Scheme.HTTPS, endpoint), Alburm[].class);
   for (Alburm alburm : Arrays.asList(alburmArr)) {
      if (alburm.getId().equals(id)){
        return alburm;
      }
      
   }
   return null;
  }
  public AlburmEnity createAlburm(Long id, Long userId, String title){ // Since we need to store the data to DB so the return type should be AlburmEnity
    return alubrmRepository.save(AlburmEnity.builder()
    .userId(userId)
    .id(id)
    .title(title)
    .build()
    );
  }
  public void updateAlburm(Long id, String title){
    
  }

}
