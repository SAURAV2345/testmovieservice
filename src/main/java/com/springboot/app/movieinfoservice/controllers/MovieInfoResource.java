package com.springboot.app.movieinfoservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.springboot.app.movieinfoservice.model.Movie;
import com.springboot.app.movieinfoservice.model.MovieSummary;

@RestController
@RequestMapping("/movies")
public class MovieInfoResource {
	
	@Autowired
	RestTemplate restTemplate; 
	
	@RequestMapping("/{movieId}")
	public Movie getMovieInfo(@PathVariable("movieId") String movieId) {
		MovieSummary movieSummary=restTemplate.getForObject("https://api.themoviedb.org/3/movie/"+movieId+"?api_key=cea3b7a0b210db1ea9f3707365849dd8", MovieSummary.class);
		return new Movie(movieSummary.getId(),movieSummary.getOriginal_title());
		//return new Movie(Integer.parseInt(movieId),"title");
		//return restTemplate.getForObject("https://api.themoviedb.org/3/movie/"+movieId+"?api_key=cea3b7a0b210db1ea9f3707365849dd8");
		
	}
}
