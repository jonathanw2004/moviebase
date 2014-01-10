package com.vmware.moviebase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MovieServiceTest {

	private MovieService movieService;
	
	@BeforeMethod
	public void setUp() {
		movieService = new MovieService("Vmware Movie Night");		
	}
	
	@Test
	public void addTwoMoviesAndGetTheTotal() {
		// Subject under test		
		movieService.addMovie(new Movie("E.T. - The Extra Terrestrial"));
		movieService.addMovie(new Movie("Wall-E"));
		assertEquals(movieService.getCount(), 2);
	}
	
	@Test
	public void addOneMovieAndGetTotal() {
		// Subject under test
		movieService.addMovie(new Movie("Wall-E"));
		assertEquals(movieService.getCount(), 1);
	}
	
	@Test
	public void getTheTotalWithNoMovies() {
		assertEquals(movieService.getCount(), 0);
	}
	
	@Test
	public void removeAMovieAndGetTotal() throws MovieException {
		movieService.addMovie(new Movie("Wall-E"));
		movieService.addMovie(new Movie("E.T. - The Extra Terrestrial"));
		movieService.removByName("Wall-E");
		assertEquals(movieService.getCount(), 1);
	}
	
	@Test
	public void removeAMovieFromAnEmptyService() {
		try {
			movieService.removByName("Wall-E");
			fail("Was expecting an exception in removeAMovieFromAnEmptyService().");
		} catch (MovieException e) {
			assertEquals(e.getMessage(), "There are no movies in the service");
			
		}
	}
	
	@Test
	public void removeAMovieThatDosentExist() {}
	
}
