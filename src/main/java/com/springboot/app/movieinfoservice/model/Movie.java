package com.springboot.app.movieinfoservice.model;

public class Movie {
	private int movieId;
	private String name;
	
	public Movie(int id,String name) {
		this.movieId=id;
		this.name=name;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
