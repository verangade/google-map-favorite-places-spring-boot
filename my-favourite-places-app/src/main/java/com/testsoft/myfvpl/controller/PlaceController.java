package com.testsoft.myfvpl.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

@RequestMapping("/")
@Controller
public class PlaceController {

	@Autowired
	private PlaceService placeService;

	private static final Logger logger = LoggerFactory.getLogger(PlaceController.class);
	/*@GetMapping
	public String getAllPlaces(Model model) {

		model.addAttribute("placeList", placeService.getAllPlaces());
		return "places";
	}*/
	
	@GetMapping
	public String getAllPlaces(Model model) {

		model.addAttribute("placeList", placeService.getAllPlaces());
		return "places";
	}

	@ResponseBody
	@RequestMapping(value="/place/{placeId}", method=RequestMethod.GET)
	public Place getPlaceById(@PathVariable long placeId) {
		Place place = placeService.getPlaceById(placeId);
		logger.debug(place.toString());
		return place;		
	}
	
	/**
	 * 
	 * @return JSON PlaceList
	 */
	@ResponseBody
	@RequestMapping(value="/place/all", method=RequestMethod.GET)
	public List<Place> getPlaceList() {
		logger.info("This method will retrive all palaces as JSON");
		return placeService.getAllPlaces();		
	}


}
