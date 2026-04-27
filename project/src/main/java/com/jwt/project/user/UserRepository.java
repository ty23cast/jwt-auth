package com.jwt.project.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

// interface for interacting with database
public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByEmail(String email);

}
