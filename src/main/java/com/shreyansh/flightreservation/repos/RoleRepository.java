package com.shreyansh.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shreyansh.flightreservation.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
