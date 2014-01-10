package com.vmware.moviebase;

import java.util.ArrayList;
import java.util.List;

public class MovieService {
	
	private int count = 0;
	private List<Movie> movies = new ArrayList<Movie>();
	
	public MovieService(String string) {
		// TODO Auto-generated constructor stub
	}

	public void addMovie(Movie movie) {
		// TODO Auto-generated method stub
		count++;
		movies.add(movie);
	}

	public Object getCount() {
		// TODO Auto-generated method stub
		return count;
	}

	public void removByName(String name) throws MovieException {
		// TODO Auto-generated method stub
		if (count == 0) {
			throw new MovieException("There are no movies in the service");
		}
		
		for (Movie m : movies) {
			if (m.getName().equals(name)) {
				movies.remove(m);
				count--;
				return;
			}
		}
		
		throw new MovieException("That movie does not exist in the service");
	}
}
