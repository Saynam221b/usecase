package com.insurance.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class ClientController {

	@Autowired
	private ClientRepo cr;
	

	
	@GetMapping("/details/id={id}") 
	
	public List<ClientEntity> getSample(@PathVariable("id") Integer id){
		
    	
		 return cr.getjoin(id);
		 
		 //http://localhost:8080/details/id=3 to get value of id 3
		
	}

	@GetMapping("/details") 

	public List<ClientEntity> getSample2(){
	
	
		return cr.getjoin2();
		//http://localhost:8080/details for all the details
	
}
	

}
