package com.bootcamp.demo_sb_restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.bootcamp.demo_sb_restapi.enity.UserEnity;
import java.util.List;




// 1. During compile time, generate Class to implement this into
// 2. Implement the all the method according to the DB driver
// 3. Construct the corresponding Entity Java Object
@Repository
public interface UserRepository extends JpaRepository<UserEnity, Long>{

  // ! JPQL
  // select from Entity Class
  // @Query("SELECT e FROM UserEntity e WHERE e.username = :username")
  // UserEnity finByUsername(@Param("username") String username);

  // @Query("SELECT e FROM UserEntity e WHERE e.username = :username ORDER BY e.website DESC")
  // UserEnity findByUsernameOrderByWebsite(@Param("username") String username);

  // // ! Native Query (SQL)
  // @Query(value = "SELECT * FROM Users e WHERE e.username = :username", nativeQuery = true)
  // UserEnity findByUsername(@Param("username") String username);

  // // Conlumn name depends on the value from Entyty
  // // For all write optreation, use @Modifying 
  // @Modifying
  // @Query(value = "UPDATE users SET user_email = : usesrEmail WHERE id = id", nativeQuery = true)
  // int updateUserEmail(@Param("userEmail") String userEmail, Long id);
}
