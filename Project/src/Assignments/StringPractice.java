package Assignments;

import java.util.ArrayList;
import java.util.List;



public class StringPractice {
public static void main(String[] args) {
	 String str="Oppo+23400+4*Samsung+21900+2";
	 List<Product> list=new ArrayList<>();
	 String [] s= str.split("\\*");
	 for (String temp : s) {
		 String[] s1= temp.split("\\+");
		 Product p= new Product();
		 p.setName(s1[0]);
		 p.setPrice(Double.parseDouble(s1[1]));
		 p.setQuantity(Integer.parseInt(s1[2]));
		 list.add(p);
		 
	 }
	 Order o = new Order(list);
	 o.printReciept();
}
}
class Product{
	String name;
	double price;
	int quantity;
	public Product(){
		
	}
	public Product(String name, double price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
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
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}

	class Order{
		List<Product> products;
		public Order(List<Product> products){
		this.products=products;
	}
		public void printReciept() {
			for(Product p: products) {
				System.out.println(p.getName());
				System.out.println(p.getPrice());
				System.out.println(p.getQuantity());
			}
		}
}


