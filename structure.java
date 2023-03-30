package pizzaapp;

import java.util.ArrayList;
import java.util.Scanner;

public class structure {
	 Scanner sc=new Scanner(System.in);
	   ArrayList<Pizza> pizzas = new ArrayList<>();
	   ArrayList<String> toppings=new ArrayList<>();
	   PizzaOrder p1=new PizzaOrder(pizzas);
	  public void getmenu() { 
		  
	   System.out.println("Enter the total pizzas you would like to order: ");
	   int totalNoPizzas = sc.nextInt();
	   Pizza pizza=new Pizza();
	   for(int i=0;i<=totalNoPizzas;i++) {
		   
		   System.out.println("enter the choice for type of pizza");
		   System.out.println("enter vegeterian");
		   System.out.println("enter non-vegeterian");
		   String typeOfPizza=sc.next();
		   pizza.setTypeofpizza(typeOfPizza);
		   System.out.println("enter type of crust");
		   System.out.println("new hand tossed");
		   System.out.println("wheat thin crust");
		   System.out.println("cheese brust");
		   System.out.println("fresh pan pizza");
		   String typeOfCrust=sc.next();
		   pizza.setCrust(typeOfCrust);
		   
		   if(typeOfPizza.equalsIgnoreCase("vegeterian")) {
			   System.out.println("enter choice for name of the veg pizza");
			   System.out.println("deluxe veggie");
			   System.out.println("cheese and corn");
			   System.out.println("paneer tikka");
			   String vegPizaa=sc.next();
			   pizza.setNameofpizza(vegPizaa);
		   
			    
			   System.out.println("Enter the size of the pizza regular,medium,large: ");
	          String pizzaSize = sc.next();
	           pizza.setSize(pizzaSize);
			   
			   System.out.println("Enter the total amount of toppings on the pizza: ");
	          int totalToppings = sc.nextInt();
	          
	          for (int j = 0; j < totalToppings; j++) {
	              System.out.println("Enter the topping: ");
	              System.out.println("black olive");
	              System.out.println("capsium");
	              System.out.println("paneer");
	              System.out.println("mashroom");
	              System.out.println("fresh tomato");
	              String topping = sc.next();
	             toppings.add(topping);
	             pizza.setToppings(toppings);
	             
	          }

		   }
		   if(typeOfPizza.equalsIgnoreCase("nonvageterian")) {
			   System.out.println("enter the choice for name of the non-veg pizza");
			   System.out.println("1.non-veg supreme");//size
			   System.out.println("2.chicken tikka");
			   System.out.println("3.pepar barbecue chicken");
			   String nonvegPizza=sc.next();
			   
			   System.out.println("Enter the size of the pizza regular,medium,large: ");
		          String pizzaSize = sc.next();
		           pizza.setSize(pizzaSize);
			   System.out.println("Enter the topping: ");
	           System.out.println("1.chicken tikka");
	           System.out.println("2.barbeque");
	           System.out.println("3.grilled chciken");
	           System.out.println("4.black olive");
	           System.out.println("5.capsium");
	           System.out.println("6.mashroom");
	           System.out.println("7.fresh tomato");
	           String topping = sc.next();
	          toppings.add(topping);
	          pizza.setToppings(toppings);
	          
		   }
		   System.out.println("do you want extra cheese");
		   System.out.println("1.yes");
		   System.out.println("2.no");
		   int extracheese=sc.nextInt();
		   
		   
		   
		 
		   System.out.println("do you want sides");
		  System.out.println("1.yes");
		  System.out.println("2.no");
		  int sides=sc.nextInt();
		  
		  if(sides==1) {
			  System.out.println("cold drink");
			  System.out.println("mouse cake");
		  String side=sc.next();
		    pizza.setSides(side);
		    pizzas.add(pizza);
		  }
		   System.out.println("do you want to place order");
		   System.out.println("1.yes2.no");
		   int placeorder=sc.nextInt();
		   if(placeorder==1) {
			   
			  // p1.displaymenu();
			   
			  // p1.calculatebillamount();
			 //  p1.calculatebillamount();
			   p1.printOrderSummary();
		   }
		  
		}
		}
}

