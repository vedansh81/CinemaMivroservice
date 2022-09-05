package com.psl.MovieMicroservice.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.psl.MovieMicroservice.Entity.Movie;


@Service
public class MovieService {

	
	@Autowired
	private MovieServicdInte msi;
	
	public List<Movie> SelectAllMovies(){
		  
		return (List<Movie>)this.msi.findAll();
	}
	
   public Movie InsertMovie(Movie movie) {
	   return this.msi.save(movie);
   }
   
   
   public Movie selectMovieById(int mid) {
	   return this.msi.findById(mid).orElse(null);
   }
   
   public List<String> selectMovieByCity(String city){
		List<Movie> lme = this.msi.findByCity(city);
		
		List<String> movies = new ArrayList<>();
		
		for(int i=0;i<lme.size();i++) {
			movies.add(lme.get(i).getMovie());
		}
		
		return movies;
	}
   
   
   public Movie selectMovieByCityAndMovie(String city, String movie){
	   return this.msi.findByCityAndMovie(city, movie);
   }
 }
