package com.testsoft.myfvpl.service;

import java.util.List;

import com.testsoft.myfvpl.model.Place;

public interface PlaceService {
	
	public List<Place> getAllPlaces();
	public Place getPlaceById(long placeId);

}
