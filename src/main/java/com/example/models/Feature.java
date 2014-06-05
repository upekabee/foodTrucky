package com.example.models;

public class Feature extends BaseFeature {
	
	// Fields
	private Geometry geometry;
	
	public Feature(Geometry geometry) {
		super(FeatureType.FEATURE.getValue());
		this.geometry = geometry;
	}
	
}
