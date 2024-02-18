package com.BusReservation.service;

import java.util.List;

import com.BusReservation.exception.AdminException;
import com.BusReservation.exception.RouteException;
import com.BusReservation.model.Route;

public interface RouteService {
	public Route addRoute(Route route,String key) throws RouteException, AdminException;
	public List<Route> viewAllRoute() throws RouteException;
	public Route viewRoute(int routeId) throws RouteException;
	public Route updateRoute(Route route,String key) throws RouteException, AdminException;
	public Route deleteRoute(int routeID,String key) throws RouteException, AdminException;
	
	
}
