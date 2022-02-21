package com.Streams;

public class Product {
	int id ;
	String name;
	double price;
	String VendorName;
	public Product(int id, String name, double price, String vendorNmae) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		VendorName = vendorNmae;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String VendorName() {
		return VendorName;
	}
	public void setVendorNmae(String VendorName) {
		VendorName = VendorName;
	}
	@Override
	public String toString() {
		return String.format("App [id=%s, name=%s, price=%s, VendorName=%s]", id, name, price, VendorName);
	}

	}


