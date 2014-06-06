package com.example.models.geojson;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
@XmlRootElement
public class Properties {
	
	// Fields
	private String markerColor;
	private String markerSize; 
	private String markerSymbol;
	
	// Getters and setters
	@JsonProperty("marker-color")
	public String getMarkerColor() {
		return markerColor;
	}

	@JsonProperty("marker-color")
	public void setMarkerColor(String markerColor) {
		this.markerColor = markerColor;
	}

	@JsonProperty("marker-size")
	public String getMarkerSize() {
		return markerSize;
	}

	@JsonProperty("marker-size")
	public void setMarkerSize(String markerSize) {
		this.markerSize = markerSize;
	}

	@JsonProperty("marker-symbol")
	public String getMarkerSymbol() {
		return markerSymbol;
	}

	@JsonProperty("marker-symbol")
	public void setMarkerSymbol(String markerSymbol) {
		this.markerSymbol = markerSymbol;
	} 
}
