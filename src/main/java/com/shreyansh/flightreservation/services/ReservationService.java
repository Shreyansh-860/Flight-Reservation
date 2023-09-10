package com.shreyansh.flightreservation.services;

import com.shreyansh.flightreservation.dto.ReservationRequest;
import com.shreyansh.flightreservation.entities.Reservation;

public interface ReservationService {
	
	public Reservation bookFlight(ReservationRequest request);

}