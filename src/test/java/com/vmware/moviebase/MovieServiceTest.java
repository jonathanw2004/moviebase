package com.vmware.moviebase;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class MovieServiceTest {

	@Test
	public void addTwoMoviesAndGetTheTotal() {
		// Subject under test
		MovieService movieService = new MovieService("Vmware Movie Night");
		movieService.addMovie(new Movie("E.T. - The Extra Terrestrial"));
		movieService.addMovie(new Movie("Wall-E"));
		assertEquals(movieService.getCount(), 2);
	}
	
	@Test
	public void addOneMovieAndGetTotal() {}
	
	@Test
	public void getTheTotalWithNoMovies() {}
	
}
