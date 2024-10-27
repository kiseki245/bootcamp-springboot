package com.bootcamp.demo_restapi2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.bootcamp.demo_restapi2.enity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long>{

    
}
