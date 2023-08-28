package com.infosys.StreamsFilter;

import java.util.ArrayList;
import java.util.List;

class Product{
	int id;
	String name;
	double price;
	
	Product(int id, String name, double price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
	}
}
public class Demo4 {

	public static void main(String[] args) {
		
		List<Product>productList=new ArrayList<Product>();
		
		productList.add(new Product(1,"Samsung",40000));
		productList.add(new Product(2,"Apple",50000));
		productList.add(new Product(3,"Redmi",30000));
		productList.add(new Product(4,"Karbonn",20000));
		
		productList.stream()
		.filter(p->p.price>20000)
		.forEach (pr->System.out.println(pr.price));

	}

}
