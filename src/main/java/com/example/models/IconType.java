package com.example.models;

import java.util.HashSet;
import java.util.Set;

public enum IconType {

	// The synonym string needs to be coma separated, no spaces, lowercase. 
	CUPCAKES("bakery", "#fa0", "cupcake,cupcakes,muffins"), 
	BURGERS("fast-food","#9c89cc", "burger,burgers,sandwich,burrito,burritos,taco,tacos,quesadillas,quesadilla"),
	SODA ("beer", "#2ebbd1", "soda,sodas,beer,beers,juice,juices"),
	COFFEE("cafe","#301e4b","coffee,coffe,coffees,tea,water,bottled water"),
	DEFAULT("restaurant","#d52a58","none");
	
	private final String icon; 
	private final String color;
	private final Set<String> synonymSet = new HashSet<String>();
	
	IconType(String icon, String color, String synonym) {
		this.icon = icon;
		this.color = color;

		String[] temp = synonym.split(",");
		for (String s : temp) {
			this.synonymSet.add(s);
		}
		
	}
	
	public String getIcon() {
		return icon;
	}
	
	public String getColor() {
		return color;
	}
	
	public Set<String> getSynonymSet() {
		return synonymSet;
	}
	
}
