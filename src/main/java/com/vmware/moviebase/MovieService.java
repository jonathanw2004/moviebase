package com.vmware.moviebase;

public class MovieService {
	private int count = 0;
	
	public MovieService(String string) {
		// TODO Auto-generated constructor stub
	}

	public void addMovie(Movie movie) {
		// TODO Auto-generated method stub
		count++;
	}

	public Object getCount() {
		// TODO Auto-generated method stub
		return count;
	}

	public void removByName(String title) throws MovieException {
		// TODO Auto-generated method stub
		if (count == 0) {
			throw new MovieException("There are no movies in the service");
		}
		
		count--;
	}

	
}
