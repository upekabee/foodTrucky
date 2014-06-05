package com.example.services;

import java.net.MalformedURLException;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.example.models.FoodTruck;
import com.example.models.SodaAPIAccessor;

@Path("/foodtrucks")
@Produces(MediaType.APPLICATION_JSON)
public class FoodTruckService {
	@GET
    public List<FoodTruck> get() throws MalformedURLException {

		SodaAPIAccessor apiAccessor = SodaAPIAccessor.getInstance(); 
		return apiAccessor.getApprovedFoodTrucks();
		
		// Cold Truck: Corn Dogs: Noodle Soups: Candy: Pre-packaged Snacks: Sandwiches: Chips: Coffee: Tea: Various Beverages
    }

}
