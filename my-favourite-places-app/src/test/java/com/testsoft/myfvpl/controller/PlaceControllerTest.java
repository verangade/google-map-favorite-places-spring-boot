package com.testsoft.myfvpl.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.testsoft.myfvpl.model.Place;
import com.testsoft.myfvpl.service.PlaceService;



@RunWith(SpringRunner.class)
@WebMvcTest(PlaceController.class)
public class PlaceControllerTest {
	
	@Autowired
	private MockMvc mvc;
	
	@MockBean
	private PlaceService placeService;
	
	@Test
	public void getPlaceListTest() throws Exception {
		Place place = new Place();
		List<Place> placeList = Arrays.asList(place);
		Mockito.when(placeService.getAllPlaces()).thenReturn(placeList);
		mvc.perform(get("/place/all")).andExpect(status().isOk());
	}

}
