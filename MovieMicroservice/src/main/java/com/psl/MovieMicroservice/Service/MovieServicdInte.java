package com.psl.MovieMicroservice.Service;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.psl.MovieMicroservice.Entity.Movie;


@Repository
public interface MovieServicdInte extends CrudRepository<Movie, Integer>{
	public List<Movie> findByCity(String city);
	public Movie findByCityAndMovie(String city,String movie);

}
