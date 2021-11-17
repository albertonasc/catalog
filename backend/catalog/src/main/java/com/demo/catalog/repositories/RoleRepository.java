package com.demo.catalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.catalog.models.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

}
