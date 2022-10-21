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
		
    	
		 return cr.getJoin(id);
		 
		 //http://localhost:8080/details/id=3 to get value of id 3
		
	}
	
	private  int discount=0;
	@GetMapping("/client_discount/{tenture}/{premium}")
    public int discount(@PathVariable String tenture, @PathVariable int premium) {
        final String more = "morethanfive";
        final String less = "lessthanfive";
        final String equal = "equalfive";
       
        if(tenture.equals(less)) {
            return premium;
        }
        
        else if(tenture.equals(equal)) {
            discount = 10*premium/100;
            return premium-discount;
        }
        
        else if(tenture == more) {

            discount =12*premium/100;
            return premium-discount;
        
    }
        return premium;
        
	}

	@GetMapping("/details") 

	public List<ClientEntity> getSample2(){
	
	
		return cr.getJoin2();
		//http://localhost:8080/details for all the details
	
}
	

}
