package com.example.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Entity.LoginEntity;

@Repository
public interface LoginRepository extends JpaRepository<LoginEntity, Long> {

}
