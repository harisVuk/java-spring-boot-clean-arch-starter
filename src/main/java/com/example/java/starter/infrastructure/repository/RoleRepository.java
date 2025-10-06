package com.example.java.starter.infrastructure.repository;

import com.example.java.starter.domain.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
