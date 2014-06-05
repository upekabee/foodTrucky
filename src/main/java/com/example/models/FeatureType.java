package com.example.models;

public enum FeatureType {

	FEATURECOLLECTION("FeatureCollection"),
	FEATURE("Feature");
	
	private final String type; 
	FeatureType(String type) {
		this.type = type; 
	}
	
	public String getValue() {
		return type;
	}
	
}
