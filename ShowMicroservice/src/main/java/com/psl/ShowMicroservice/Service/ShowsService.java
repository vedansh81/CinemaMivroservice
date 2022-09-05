package com.psl.ShowMicroservice.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.psl.ShowMicroservice.Entity.Shows;


@Service
public class ShowsService {

	
	@Autowired
	private ShowsServiceInte ssi;
	
	
	
	public Shows InsertShow(Shows shows) {
		return this.ssi.save(shows);
	}
	
	public List<Shows> selectAllShows(){
		return (List<Shows>) this.ssi.findAll();
	}
	
	public List<Shows> selectShowByMid(int mid) {
		return this.ssi.findByMid(mid);
	}
}
