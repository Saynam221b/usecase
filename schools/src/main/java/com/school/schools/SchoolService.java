package com.school.schools;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class SchoolService {
	
	
		@Autowired
	    private SchoolRepo2 schoolRepository;

	    public List<SchoolEntity> list() {
	        return schoolRepository.findAll();
	    }

}
