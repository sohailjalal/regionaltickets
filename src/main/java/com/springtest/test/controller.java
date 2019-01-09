package com.springtest.test;
import java.util.List;

// import javax.rs.ws.Path;

import java.util.List;

import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class controller {
	@Autowired
	regionalticketsrepo repo;
	
		@RequestMapping("/")
		public String home()
		
		{
				return "home";		
		}
		@RequestMapping("/alltickets")
		@ResponseBody
		
		public List<regionaltickets> gettickets()
			{
			return repo.findAll();
				
			}
		
		
		@RequestMapping("/alltickets/{region}")
		@ResponseBody
		public List<regionaltickets> getTicketsbyRegion(@PathVariable String region)
			{
		
			return repo.findByRegion(region);
				
			}
}