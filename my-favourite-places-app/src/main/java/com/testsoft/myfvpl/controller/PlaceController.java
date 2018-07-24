package com.testsoft.myfvpl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.testsoft.myfvpl.model.Place;
import com.testsoft.myfvpl.service.PlaceService;

@RequestMapping("/place")
@Controller
public class PlaceController {

	@Autowired
	private PlaceService placeService;

	@GetMapping
	public String getAllPlaces(Model model) {

		model.addAttribute("placeList", placeService.getAllPlaces());
		return "places";
	}

	@ResponseBody
	@RequestMapping(value="/{placeId}", method=RequestMethod.GET)
	public Place getPlaceById(@PathVariable long placeId) {
		Place place = placeService.getPlaceById(placeId);
		return place;		
	}
	
	@ResponseBody
	@RequestMapping(value="/all", method=RequestMethod.GET)
	public List<Place> getPlaceList() {
	
		return placeService.getAllPlaces();		
	}


}
