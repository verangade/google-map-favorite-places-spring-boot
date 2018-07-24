package com.testsoft.myfvpl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testsoft.myfvpl.model.Place;
import com.testsoft.myfvpl.repository.PlaceRepository;

@Service
public class PlaceServiceImpl implements PlaceService {
	
	@Autowired
	private PlaceRepository placeReposiroty;

	@Override
	public List<Place> getAllPlaces() {
		return placeReposiroty.findAll();
	}

	@Override
	public Place getPlaceById(long placeId) {
		Place place = placeReposiroty.getOne(placeId);
		return place;
		
	}

}
