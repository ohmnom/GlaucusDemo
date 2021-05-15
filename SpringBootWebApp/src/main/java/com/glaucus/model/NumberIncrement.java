package com.glaucus.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "NUMBER")
public class NumberIncrement {
	
	@Id
	@GeneratedValue
	private int id;
	private int currentValue;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCurrentValue() {
		return currentValue;
	}
	public void setCurrentValue(int currentValue) {
		this.currentValue = currentValue;
	}
	
	

}
