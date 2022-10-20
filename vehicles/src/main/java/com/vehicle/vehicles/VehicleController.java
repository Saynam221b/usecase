package com.vehicle.vehicles;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VehicleController {

	
	@Autowired
	private CarRepo cr;
	
	@Autowired
	private TruckRepo tr;
	
@GetMapping("/c") 
	
	public List<CarEntity> getSample(){
		
    	return cr.getjoin();
	}
@GetMapping("/t") 

public List<TruckEntity> getSample2(){
	
	return tr.getjoin1();
}


}
