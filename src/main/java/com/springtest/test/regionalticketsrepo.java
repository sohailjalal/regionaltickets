package com.springtest.test;

import java.util.List;
import com.springtest.test.regionaltickets;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface regionalticketsrepo extends JpaRepository<regionaltickets,Integer> 
{
	List<regionaltickets> findByRegion(String region);
	

}