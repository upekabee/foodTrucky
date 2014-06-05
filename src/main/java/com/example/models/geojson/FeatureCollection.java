package com.example.models.geojson;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
@XmlRootElement
public class FeatureCollection extends BaseFeature {
	
	// Fields
	List<Feature> features;
	
	public FeatureCollection() {
		super(FeatureType.FEATURECOLLECTION.getValue());
	}
	
	// Getters and setters
	public List<Feature> getFeatures() {
		return features;
	}

	public void setFeatures(List<Feature> features) {
		this.features = features;
	} 
	
}
