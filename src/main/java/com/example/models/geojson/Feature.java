package com.example.models.geojson;

import javax.xml.bind.annotation.XmlRootElement;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
@XmlRootElement
public class Feature extends BaseFeature {
	
	// Fields
	private Geometry geometry;
	private Properties properties; 
	
	public Feature(Geometry geometry, Properties properties) {
		super(FeatureType.FEATURE.getValue());
		this.geometry = geometry;
		this.properties = properties; 
	}
	
	// Getters and setters
	public Geometry getGeometry() {
		return geometry;
	}
	
	public void setGeometry(Geometry geometry) {
		this.geometry = geometry;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	
}
