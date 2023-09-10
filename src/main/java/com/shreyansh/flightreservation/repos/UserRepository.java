package com.shreyansh.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shreyansh.flightreservation.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);

}