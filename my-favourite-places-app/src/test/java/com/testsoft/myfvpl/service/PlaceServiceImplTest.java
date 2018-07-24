package com.testsoft.myfvpl.service;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import com.testsoft.myfvpl.model.Place;
import com.testsoft.myfvpl.repository.PlaceRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PlaceServiceImplTest {
	
	@TestConfiguration
	static class PlaceServiceImplTestContextConfiguration {
		  
		@Bean
		public static PlaceService placeService() {
			return new PlaceServiceImpl();
		}

    }
	
	@Autowired
	private PlaceService placeService;
	
	@MockBean
	private PlaceRepository placeRepository;
	
	private List<Place> placeList = new ArrayList<Place>();
	
	@Before
	public void setup() {
		
		Place place1 = new Place();
		place1.setId(1);
		place1.setName("");
		
		this.placeList.add(place1);
		
		Mockito.when(placeRepository.findAll()).thenReturn(placeList);
	}
	
	@Test
	public void testFindAll() {
		List<Place> placeList = placeService.getAllPlaces();
		assertThat(placeList).isNotNull();
	}
}
