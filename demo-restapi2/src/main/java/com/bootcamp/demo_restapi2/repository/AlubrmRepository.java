package com.bootcamp.demo_restapi2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.bootcamp.demo_restapi2.enity.AlburmEnity;

@Repository
public interface AlubrmRepository extends JpaRepository<AlburmEnity, Long>{
}
