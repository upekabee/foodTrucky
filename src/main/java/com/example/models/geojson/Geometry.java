package com.example.models.geojson;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
@XmlRootElement
public class Geometry extends BaseFeature {
	
	// Fields
	private double[] coordinates; 
	
	public Geometry() {
		super(FeatureType.GEOMETRY.getValue());
	}
	
	// Getters and setters
	public double[] getCoordinates() {
		return coordinates;
	}
	
	public void setCoordinates(double[] coordinates) {
		this.coordinates = coordinates;
	}
}
