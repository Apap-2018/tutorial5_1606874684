package com.apap.tutorial5.service;

import com.apap.tutorial5.model.FlightModel;
import com.apap.tutorial5.model.PilotModel;
import com.apap.tutorial5.repository.FlightDB;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * FlightServiceImpl
 */
@Service
@Transactional
public class FlightServiceImpl implements FlightService {
	@Autowired
	private FlightDB flightDb;
	private List<FlightModel> archieveFlight;
	
	@Override
	public void addFlight(FlightModel flight) {
		flightDb.save(flight);
	}
	
	@Override
	public void deleteFlightById(long id) {
		flightDb.deleteById(id);
	}
	
	@Override
	public List<FlightModel> getFlightList() {
		return archieveFlight;
	}
	
	@Override
	public List<FlightModel> viewAllFlight() {
		  return flightDb.findAll();
		 }
}
