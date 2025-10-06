package com.example.java.starter.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.java.starter.domain.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
