package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.UK);
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.0));
		list.add(new Product("Mouse", 50.0));
		list.add(new Product("Tablet", 250.50));
		list.add(new Product("HD Case", 80.90));
		
		//Lambda expression
		list.removeIf(p -> p.getPrice() >= 100);
		
		for(Product p : list) {
			System.out.println(p);
		}
		
	}
	
}