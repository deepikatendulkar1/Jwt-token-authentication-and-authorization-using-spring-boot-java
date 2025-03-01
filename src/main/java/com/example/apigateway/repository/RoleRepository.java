package com.example.apigateway.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.apigateway.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByName(String name);
}