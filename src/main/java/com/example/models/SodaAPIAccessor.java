package com.example.models;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

public class SodaAPIAccessor {
	
	private List<FoodTruck> foodTrucks = new ArrayList<FoodTruck>(); 

	public String getAPI_ACCESS_ENDPOINT() {
		return API_ACCESS_ENDPOINT;
	}

	private String API_ACCESS_ENDPOINT = "http://data.sfgov.org/resource/rqzj-sfat.json?locationid=305709";
	
	public SodaAPIAccessor() throws MalformedURLException {
		URL apiEndpoint = new URL(API_ACCESS_ENDPOINT);
		ObjectMapper mapper = new ObjectMapper();
		 
		try {
			
			List<FoodTruck> trucks = mapper.readValue(apiEndpoint, new TypeReference<List<FoodTruck>>(){});
			foodTrucks.addAll(trucks);
	 
		} catch (JsonGenerationException e) {
			e.printStackTrace();
	 
		} catch (JsonMappingException e) {
			e.printStackTrace();
	 
		} catch (IOException e) {
			e.printStackTrace();
	 
		}
 
    }
	
	public List<FoodTruck> getFoodTrucks() {
		return foodTrucks;
	}
	
// API fields
//		private String locationIdField = "locationId";
//		private String applicantField = "applicant";
//		private String facilitytypeField = "facilitytype";
//		private String cnnField = "cnn";
//		private String locationdescriptionField = "locationdescription";
	
}
