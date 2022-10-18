package com.employee.emp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class SampleController {
	@Autowired
	private EmployeeRepo er;// up to date

	@GetMapping("/employeename") 
	
	public List<String> getSample(){
		ArrayList<String> name=new ArrayList<String>();
    	for(EmployeeEntity emt:er.findAll()) {
    		name.add(emt.getEmployee_name());
    	}
    	return name;
	}
	
	
	@GetMapping("/id") 
	
	public ArrayList<Integer> getSample2(){
		ArrayList<Integer> id=new ArrayList<Integer>();
    	for(EmployeeEntity emt:er.findAll()) {
    		id.add(emt.getId());
    
    	}
    	return id;
	}
	

	@GetMapping("/dept") 
	
	public ArrayList<String> getSample5(){
		ArrayList<String> dept=new ArrayList<String>();
    	for(EmployeeEntity emt:er.findAll()) {
    		dept.add(emt.getDept());
    
    	}
    	return dept;
	}
	
	
	@GetMapping("/a") 
	
	public List<String> getsample3(){
		ArrayList<String> transformedvalues=new ArrayList<String>();
    	for(EmployeeEntity emt:er.findAll()) {
    		if(emt.getEmployee_name().startsWith("A")){
    		transformedvalues.add(emt.getEmployee_name());
    		}	
    		
    	}
    	return transformedvalues;
	}
	
	
	
@GetMapping("/sort") 
	
	public List<String> getsample4(){
		ArrayList<String> transformedvalues=new ArrayList<String>();
    	for(EmployeeEntity emt:er.findAll()) {
    		transformedvalues.add(emt.getEmployee_name());
    		
    		Collections.sort(transformedvalues);
    	}
    	return transformedvalues;
	}
	
}






























