package com.vmware.moviebase;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MovieService {
	
	private Set<String> movies = new HashSet<String>();
	
	public MovieService(String string) {
		// TODO Auto-generated constructor stub
	}

	public void addMovie(Movie movie) throws MovieException {
		movies.add(movie.getName());
	}

	public Object getCount() {
		return movies.size();
	}

	public void removByName(String name) throws MovieException {
		// TODO Auto-generated method stub
		if (movies.size() == 0) {
			throw new MovieException("There are no movies in the service");
		}
		
		if (!movies.remove(name)) {
			throw new MovieException("That movie does not exist in the service");
		}
	}
}
