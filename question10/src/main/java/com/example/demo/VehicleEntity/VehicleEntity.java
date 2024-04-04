package com.example.demo.VehicleEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Table;
@Entity
@Table(name = "vehicles")
public class VehicleEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String make;
	private String model;
	private String vin;
	private int yearOfManufacture;
	private String color;
	private double price;
	public int getId() {
	return id;
	}
	public void setId(int id) {
	this.id = id;
	}
	public String getMake() {
	return make;
	}
	public void setMake(String make) {
	this.make = make;
	}
	public String getModel() {
	return model;
	}
	public void setModel(String model) {
	this.model = model;
	}
	public String getVin() {
	return vin;
	}
	public void setVin(String vin) {
	this.vin = vin;
	}
	public int getYearOfManufacture() {
	return yearOfManufacture;
	}
	public void setYearOfManufacture(int yearOfManufacture) {
	this.yearOfManufacture = yearOfManufacture;
	}
	public String getColor() {
	return color;
	}
	public void setColor(String color) {

	this.color = color;
	}
	public double getPrice() {
	return price;
	}
	public void setPrice(double price) {
	this.price = price;
	}

	}
