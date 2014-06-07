package com.example.models;

import javax.xml.bind.annotation.XmlRootElement;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
@XmlRootElement
public class FoodTruck {
	
	// Fields
	private String status; 
	private String permit; 
	private String block; 
	private String received; 
	private String faciltytype; 
	private String blocklot; 
	private String locationdescription; 
	private int cnn;
	private String priorpermit; 
	//private String schedule; 
	private String address; 
	private String applicant; 
	private String lot; 
	private String foodItems; 
	private String[] foodItemsList; 
	private int objectid; 
	private Location location; 
	
	public FoodTruck() {
    }
	
	// Getters and setters
	public String getStatus() {
		return status;
	}

	public String getPermit() {
		return permit;
	}

	public String getBlock() {
		return block;
	}

	public String getReceived() {
		return received;
	}

	@JsonProperty("faciltytype")
	public String getFaciltytype() {
		return faciltytype;
	}

	@JsonProperty("blocklot")
	public String getBlocklot() {
		return blocklot;
	}

	@JsonProperty("locationdescription")
	public String getLocationdescription() {
		return locationdescription;
	}

	public int getCnn() {
		return cnn;
	}

	public String getPriorpermit() {
		return priorpermit;
	}

//	public String getSchedule() {
//		return schedule;
//	}

	public String getAddress() {
		return address;
	}

	public String getApplicant() {
		return applicant;
	}

	public String getLot() {
		return lot;
	}

	@JsonProperty("fooditems")
	public String getFooditems() {
		return foodItems;
	}

	public int getObjectid() {
		return objectid;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}

	public void setPermit(String permit) {
		this.permit = permit;
	}

	public void setBlock(String block) {
		this.block = block;
	}

	public void setReceived(String received) {
		this.received = received;
	}

	@JsonProperty("faciltytype")
	public void setFaciltytype(String faciltytype) {
		this.faciltytype = faciltytype;
	}

	public void setBlocklot(String blocklot) {
		this.blocklot = blocklot;
	}

	public void setLocationdescription(String locationdescription) {
		this.locationdescription = locationdescription;
	}

	public void setCnn(int cnn) {
		this.cnn = cnn;
	}

	public void setPriorpermit(String priorpermit) {
		this.priorpermit = priorpermit;
	}

//	public void setSchedule(String schedule) {
//		this.schedule = schedule;
//	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setApplicant(String applicant) {
		this.applicant = applicant;
	}

	public void setLot(String lot) {
		this.lot = lot;
	}

	@JsonProperty("fooditems")
	public void setFooditems(String foodItems) {
		this.foodItems = foodItems;
	}

	public void setObjectid(int objectid) {
		this.objectid = objectid;
	}
	
	@JsonProperty("location")
	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public String[] getFoodItemsList() {
		return foodItemsList;
	}

	public void setFoodItemsList(String[] foodItemsList) {
		this.foodItemsList = foodItemsList;
	}
}
