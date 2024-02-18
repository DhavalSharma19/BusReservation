package com.BusReservation.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BusReservation.model.Route;
@Repository
public interface RouteRepository extends JpaRepository<Route, Integer>{
	
	public Route findByRouteFromAndRouteTo(String from,String to);	

}
