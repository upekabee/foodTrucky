package com.example.services;

import java.net.MalformedURLException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.example.models.SodaAPIAccessor;
import com.example.models.geojson.FeatureCollection;

@Path("/geojson")
@Produces(MediaType.APPLICATION_JSON)
public class GeoJSONService {

	@GET
    public FeatureCollection get() throws MalformedURLException {

		SodaAPIAccessor apiAccessor = SodaAPIAccessor.getInstance(); 
		return apiAccessor.getGeoJSON();
		
    }
	
}
