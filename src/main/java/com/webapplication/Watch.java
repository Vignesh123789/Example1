package com.webapplication;

import java.util.Comparator;

public class Watch {
	
	private int id;
	private String brand;
	private int price;
	private String colour;
	private String material;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public static Watch max(Comparator<Watch> comparing) {
		// TODO Auto-generated method stub
		return null;
	}
	public Watch get() {
		// TODO Auto-generated method stub
		return null;
	}

}
