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

import com.example.models.geojson.FeatureCollection;
import com.example.models.geojson.Feature;
import com.example.models.geojson.Geometry;
import com.example.models.geojson.Properties;

public class SodaAPIAccessor {
	
	private List<FoodTruck> foodTrucks = new ArrayList<FoodTruck>(); 
	private List<FoodTruck> approvedFoodTrucks = new ArrayList<FoodTruck>(); 

	private static SodaAPIAccessor instance = null;
	private String API_ACCESS_ENDPOINT = "http://data.sfgov.org/resource/rqzj-sfat.json";
	private String APPROVED_STATUS = "APPROVED";
	
	public static SodaAPIAccessor getInstance() throws MalformedURLException {
	
		if (instance == null) {
			instance = new SodaAPIAccessor();
		}
		return instance; 
	}
	
	private SodaAPIAccessor() throws MalformedURLException {
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
		
		// Create list of approved food trucks
		for (FoodTruck f : foodTrucks) {
			if (f.getStatus().equalsIgnoreCase(APPROVED_STATUS)) {
				approvedFoodTrucks.add(f);
			}
		}
 
    }
	
	public List<FoodTruck> getAllFoodTrucks() {
		return foodTrucks;
	}
	
	public List<FoodTruck> getApprovedFoodTrucks() {
		return approvedFoodTrucks;
	}
	
	public String getAPI_ACCESS_ENDPOINT() {
		return API_ACCESS_ENDPOINT;
	}
	
	public FeatureCollection getGeoJSON() throws MalformedURLException {
		
		FeatureCollection featureCollection = new FeatureCollection();
		List<Feature> features = new ArrayList<Feature>();
		featureCollection.setFeatures(features);
		
		List<FoodTruck> foodTrucks = SodaAPIAccessor.getInstance().getApprovedFoodTrucks();
		for (int i=0; i<foodTrucks.size(); i++) {
			
			FoodTruck ft = foodTrucks.get(i);
			if (ft.getLocation() != null) {
				// Create coordinates
				double[] coordinates = new double[2];
				coordinates[0] = ft.getLocation().getLongitude();
				coordinates[1] = ft.getLocation().getLatitude();

				// Set coordinates on geometry 
				Geometry geo = new Geometry();
				geo.setCoordinates(coordinates);
				
				Properties properties = new Properties(); 
				properties.setMarkerSize("large");
				
				if (i % 2 == 0) {
					properties.setMarkerColor("#fa0");
					properties.setMarkerSymbol("fast-food");
					
				} else {
					properties.setMarkerColor("#9c89cc");
					properties.setMarkerSymbol("cafe");
				}
				
				Feature f = new Feature(geo, properties);
				features.add(f);
			}
		}
		
		return featureCollection;
		
	}
}
