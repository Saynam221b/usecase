package com.school.schools;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



	
	@RestController
	public class SampleController {
		@Autowired
		private SchoolRepo er;// up to date

		@GetMapping("/sample") 
		
		public List<SchoolEntity> getSample(){
			ArrayList<SchoolEntity> transformedvalues=new ArrayList<SchoolEntity>();
	    	for(SchoolEntity emt:er.findAll()) {
	    		SchoolEntity temp=new SchoolEntity();
	    		temp.setId(emt.getId());
	    		temp.setSchool_name(emt.getSchool_name());
	    		transformedvalues.add(temp);
	    		
}
			return transformedvalues;
		}
}
