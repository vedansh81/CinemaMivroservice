package com.psl.MovieMicroservice.Controlelr;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.psl.MovieMicroservice.DTO.TheatreList;
import com.psl.MovieMicroservice.Entity.Movie;
import com.psl.MovieMicroservice.Entity.Shows;
import com.psl.MovieMicroservice.Service.MovieService;

@RestController
@RequestMapping("/movies")
public class MovieController {
	@Autowired 
	private MovieService ms;
	@Autowired
	private RestTemplate rt;s
	@Autowired
	private ObjectMapper jacksonObjectMapper;
	
	@PostMapping("/movie")
	public Movie InsertMovieData(@RequestBody Movie movie) {
		return ms.InsertMovie(movie);
		
	}
	
	@GetMapping("/movies")
	public List<Movie> getAllMovies(){
		return this.ms.SelectAllMovies();
	}
	
	@GetMapping("/movieS/{mid}")
	public Movie getMovieById(@PathVariable("mid") int mid) {
		Movie m1 = this.ms.selectMovieById(mid);
		
		//http://localhost:9002/shows/movie/1
		
		List<Shows> ls = this.rt.getForObject("http://SHOW-SERVICE/shows/movie/"+m1.getMid(), List.class);
		m1.setShows(ls);
		return m1;
	}
	
	@GetMapping("/{city}")
	public List<String> getMoviesByCity(@PathVariable("city") String city){
		return this.ms.selectMovieByCity(city);
	}
	
	
	@GetMapping("/{city}/{movie}")
	public List<TheatreList> getTheatreAndNoS(@PathVariable("city") String city, @PathVariable("movie") String movie){
		
		Movie lom= this.ms.selectMovieByCityAndMovie(city, movie);
		List<Shows> ls = this.rt.getForObject("http://SHOW-SERVICE/shows/movie/"+lom.getMid(), ArrayList.class);
		lom.setShows(ls);
		List<Shows> ls1 = (ArrayList<Shows>)lom.getShows();
		List<TheatreList> lot = new ArrayList<>();
		
		for(int i=0;i<ls1.size();i++) {
		  TheatreList th = new TheatreList();
		  Shows s = jacksonObjectMapper.convertValue(ls1.get(i), Shows.class);
		  th.setTheatreName(s.getTheatre());
		  th.setCountofsets(s.getNoofseats());
		  
		  lot.add(th);
		}
		
		return lot;
	}	

}
