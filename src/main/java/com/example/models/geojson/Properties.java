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
	private String[] foodItemList; 
	private String name;
	private String address;
	private String url; 
	private String image; 
	
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

	@JsonProperty("foods")
	public String[] getFoodItemList() {
		return foodItemList;
	}

	@JsonProperty("foods")
	public void setFoodItemList(String[] foodItemList) {
		this.foodItemList = foodItemList;
	}

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("address")
	public String getAddress() {
		return address;
	}

	@JsonProperty("address")
	public void setAddress(String address) {
		this.address = address;
	}

	@JsonProperty("url")
	public String getUrl() {
		return url;
	}

	@JsonProperty("url")
	public void setUrl(String url) {
		this.url = url;
	} 
	
	@JsonProperty("image")
	public String getImage() {
		return image;
	}

	@JsonProperty("image")
	public void setImage(String image) {
		this.image = image;
	} 
}
