package com.bootcamp.demo_restapi2;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import com.bootcamp.demo_restapi2.controller.UserController;
import com.bootcamp.demo_restapi2.enity.UserEntity;
import com.bootcamp.demo_restapi2.model.User;
import com.bootcamp.demo_restapi2.service.UserService;

// @WebMvcTest
public class BeanUserControllerTest {
  // @Autowired
  // private MockMvc mocMvc; //Postman

  // @MockBean
  // private UserService userService;

  // @Test 
  // void testGetUserByUser() throws Exception{
  //   // Postman -> URL -> SpringBoot Controller -> Service
  //   // Assumgtime
  //   UserEntity userEntity = UserEntity.builder().id(Long.valueOf(1)).phone("123456")
  //   .build();
  //   Mockito.when(this.userService.getUser(Long.valueOf(1))).thenReturn(User);

  //   //Test
  //   this.mocMvc.
  //   perform(MockMvcRequestBuilders.get("/user").param("username", "John"))
  //   .andExpect(MockMvcResultMatchers.status().isOk())
  //   .andExpect(
  //     MockMvcResultMatchers.jsonPath("$.code", Matchers.is("000000")))
  //     .andExpect(MockMvcResultMatchers.jsonPath("$.message", Matchers.is("Success")))
  //     .andExpect(MockMvcResultMatchers.jsonPath("$.data.[*].name").value(Matchers.hasItem("Betty")));
  
  // }
}
