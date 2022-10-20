package com.insurance.client;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;




public interface ClientRepo extends JpaRepository<ClientEntity, Integer>{
	 
	@Query(value = "select * from client_details c where c.client_id = ?1",nativeQuery = true)
	List<ClientEntity> getjoin(Integer client_id);
	
	
	@Query(value = "select * from client_details",nativeQuery = true)
	List<ClientEntity> getjoin2();

	
   
}
