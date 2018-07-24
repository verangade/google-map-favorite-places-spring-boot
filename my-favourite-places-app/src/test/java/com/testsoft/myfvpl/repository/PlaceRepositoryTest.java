package com.testsoft.myfvpl.repository;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.testsoft.myfvpl.model.Place;



@RunWith(SpringRunner.class)
@DataJpaTest
public class PlaceRepositoryTest {
	
	@Autowired
	private PlaceRepository placeRepository; 
	
	private static final Logger logger = LoggerFactory.getLogger(PlaceRepositoryTest.class);
	
	@Test
	public void findAllPlacesTest() {
		List<Place> list = placeRepository.findAll();
		System.out.println(list);
		logger.info(list.toString());
		assertNotNull(list);
	}

}
