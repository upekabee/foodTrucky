package com.example.models;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class FoodTruck {
	
	private String status; 
	private String permit; 
	private String block; 
	private Date received; 
	private String faciltytype; 
	private String blocklot; 
	private String locationdescription; 
	private int cnn;
	private String priorpermit; 
	private String schedule; 
	private String address; 
	private String applicant; 
	private String lot; 
	private String fooditems; 
	private int objectid; 
	
	public FoodTruck() {
    }
	
	public String getStatus() {
		return status;
	}

	public String getPermit() {
		return permit;
	}

	public String getBlock() {
		return block;
	}

	public Date getReceived() {
		return received;
	}

	public String getFaciltytype() {
		return faciltytype;
	}

	public String getBlocklot() {
		return blocklot;
	}

	public String getLocationdescription() {
		return locationdescription;
	}

	public int getCnn() {
		return cnn;
	}

	public String getPriorpermit() {
		return priorpermit;
	}

	public String getSchedule() {
		return schedule;
	}

	public String getAddress() {
		return address;
	}

	public String getApplicant() {
		return applicant;
	}

	public String getLot() {
		return lot;
	}

	public String getFooditems() {
		return fooditems;
	}

	public int getObjectid() {
		return objectid;
	}
	
}
