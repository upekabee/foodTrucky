package com.example.models;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class FoodTruck {
	
	private int locationId; 
	private String applicant; 
	private FacilityType faciltyType; 
	private int cnn; 
	private String locationDescription; 
	
	public FoodTruck(int locationId, String applicant,
			FacilityType faciltyType, int cnn, 
			String locationDescription) {
		
		this.locationId = locationId;
		this.applicant = applicant;
		this.faciltyType = faciltyType;
		this.cnn = cnn;
		this.locationDescription = locationDescription;
	}
	
	public int getLocationId() {
		return locationId;
	}

	public String getApplicant() {
		return applicant;
	}

	public FacilityType getFaciltyType() {
		return faciltyType;
	}

	public int getCnn() {
		return cnn;
	}

	public String getLocationDescription() {
		return locationDescription;
	}
	
}
