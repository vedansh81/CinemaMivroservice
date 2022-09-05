package com.psl.ShowMicroservice.Service;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.psl.ShowMicroservice.Entity.Shows;


@Repository
public interface ShowsServiceInte extends CrudRepository<Shows, Integer>{
   
	
	 public List<Shows> findByMid(int mid);
}
