package com.springtest.test;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.client.RestTemplate;

import junit.framework.Assert;


@RunWith(SpringRunner.class)

@SpringBootTest
public class TestApplicationTests {
	

	@Test
	public void testtickets() throws URISyntaxException
	{
	    RestTemplate restTemplate = new RestTemplate();
	     
	    final String baseUrl = "http://localhost:8080/alltickets/northeast";
	    URI uri = new URI(baseUrl);
	 
	    ResponseEntity<List<regionaltickets>> result = restTemplate.exchange(uri, HttpMethod.GET,
	    		  null,
	    		  new ParameterizedTypeReference<List<regionaltickets>>(){});
	    
	    List<regionaltickets> tickets = result.getBody();
	    
	    
	    //Verify request succeed
	    Assert.assertEquals(200, result.getStatusCodeValue());
	    //Assert.assertEquals(true, result.getBody().contains("employeeList"));
	}

	@Test
	public void testnortheasttickets() throws URISyntaxException
	{
	    RestTemplate restTemplate = new RestTemplate();
	     
	    final String baseUrl = "http://localhost:8080/alltickets/northeast";
	    URI uri = new URI(baseUrl);
	 
	    ResponseEntity<List<regionaltickets>> result = restTemplate.exchange(uri, HttpMethod.GET,
	    		  null,
	    		  new ParameterizedTypeReference<List<regionaltickets>>(){});
	    
	    List<regionaltickets> tickets = result.getBody();
	    
	    int i = 0;
		while (i < tickets.size()) {
		//	System.out.println(tickets.get(i).getRegion());
			// will update this block with appropriate return code generation 
			if (tickets.get(i).getRegion().equals("northeast") )
			{
				
				System.out.println("northeast ");
			} else
			{
				System.out.println("compare issue");
			} 
				
						i++;
		}
	    
	}

}

