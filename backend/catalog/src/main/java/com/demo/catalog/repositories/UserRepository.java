package com.demo.catalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.catalog.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
