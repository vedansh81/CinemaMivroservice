package com.psl.ShowMicroservice.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.psl.ShowMicroservice.Entity.Shows;
import com.psl.ShowMicroservice.Service.ShowsService;

@RestController
@RequestMapping("/shows")
public class ShowsController {

	@Autowired
	private ShowsService ss;
	
	
	@PostMapping("/show")
	public Shows SaveShow(@RequestBody Shows shows) {
		return this.ss.InsertShow(shows);
		
	}
	
	@GetMapping("/shows")
	public List<Shows> getaAllShows(){
		return this.ss.selectAllShows();
	}
	
	@GetMapping("/movie/{mid}")
	public List<Shows> getShowsByMid(@PathVariable("mid") int mid) {
		return this.ss.selectShowByMid(mid);
		
	}
}
