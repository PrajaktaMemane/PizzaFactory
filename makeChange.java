package pizzaapp;

import java.util.ArrayList;
import java.util.Scanner;

public class makeChange {
Scanner sc=new Scanner(System.in);
	

	ArrayList<Pizza> list=new ArrayList<>();
	


	public void addpizza(String size,String crust, String sides, String typeofpizza,
			String nameofpizza) {
		Pizza p1=new Pizza(size,crust,sides,typeofpizza,nameofpizza);
		list.add(p1);
		
		
	}

}
