package com.psl.MovieMicroservice.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="shows")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Shows {
	
	@Id
	private int tid;
	private int mid;
	private String theatre;
	private int noofseats;
	
    
    	public Shows() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getTheatre() {
		return theatre;
	}
	public void setTheatre(String theatre) {
		this.theatre = theatre;
	}
	public int getNoofseats() {
		return noofseats;
	}
	public void setNoofseats(int noofseats) {
		this.noofseats = noofseats;
	}
	public Shows(int tid, int mid, String theatre, int noofseats) {
		super();
		this.tid = tid;
		this.mid = mid;
		this.theatre = theatre;
		this.noofseats = noofseats;
	}
	
	
	

}
