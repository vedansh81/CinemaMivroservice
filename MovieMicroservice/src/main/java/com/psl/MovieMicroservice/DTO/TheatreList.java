package com.psl.MovieMicroservice.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TheatreList {
	
	private String theatreName	;
	private int countofsets;
	public String getTheatreName() {
		return theatreName;
	}
	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
	}
	public int getCountofsets() {
		return countofsets;
	}
	public void setCountofsets(int countofsets) {
		this.countofsets = countofsets;
	}
	public TheatreList(String theatreName, int countofsets) {
		super();
		this.theatreName = theatreName;
		this.countofsets = countofsets;
	}
	public TheatreList() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	
	
	
	
}
