package com.psl.MovieMicroservice.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="movie")
public class Movie {
	
 
@Id
@Column
@GeneratedValue(strategy=GenerationType.AUTO)
private int mid;
@Column
 private String city;
@Column
 private String movie;

 @OneToMany
 private List<Shows> shows = new ArrayList<>();
 
 

public Movie(int mid, String city, String movie, List<Shows> shows) {
	super();
	this.mid = mid;
	this.city = city;
	this.movie = movie;
	this.shows = shows;
}
public List<Shows> getShows() {
	return shows;
}
public void setShows(List<Shows> shows) {
	this.shows = shows;
}
public int getMid() {
	return mid;
}
public void setMid(int mid) {
	this.mid = mid;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getMovie() {
	return movie;
}
public void setMovie(String movie) {
	this.movie = movie;
}
public Movie(int mid, String city, String movie) {

	this.mid = mid;
	this.city = city;
	this.movie = movie;
}
public Movie() {
	super();
	// TODO Auto-generated constructor stub
 }

}
