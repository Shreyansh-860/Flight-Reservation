package com.shreyansh.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shreyansh.flightreservation.entities.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
