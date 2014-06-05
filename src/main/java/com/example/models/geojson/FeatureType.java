package com.example.models.geojson;

public enum FeatureType {

	FEATURECOLLECTION("FeatureCollection"),
	FEATURE("Feature"), 
	GEOMETRY("Point"); // All I have right now are Points. 
	
	private final String type; 
	FeatureType(String type) {
		this.type = type; 
	}
	
	public String getValue() {
		return type;
	}
	
}
