package com.shreyansh.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shreyansh.flightreservation.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
