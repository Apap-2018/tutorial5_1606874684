package com.apap.tutorial5.service;

import java.util.List;

import com.apap.tutorial5.model.FlightModel;
import com.apap.tutorial5.model.PilotModel;

/**
 * FlightService
 */
public interface FlightService {
	void addFlight(FlightModel flight);
	void deleteFlightById(long id);
	List<FlightModel> getFlightList();
	List<FlightModel> viewAllFlight();
}
