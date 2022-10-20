package com.vehicle.vehicles;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepo extends JpaRepository<CarEntity, Integer>{

    
    @Query(value = "SELECT * FROM  `vehicle`.`car` e join `vehicle`.`bike` m on e.car_id=m.bike_id",nativeQuery = true)
    public List<CarEntity> getjoin();

	

}
