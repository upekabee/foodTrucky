package com.example.models.geojson;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
@XmlRootElement
public class Properties {
	
	// Fields
	private String markerColor;
		
	// Getters and setters
	@JsonProperty("marker-color")
	public String getMarkerColor() {
		return markerColor;
	}

	@JsonProperty("marker-color")
	public void setMarkerColor(String markerColor) {
		this.markerColor = markerColor;
	} 
}
