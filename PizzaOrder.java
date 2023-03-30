package pizzaapp;

import java.util.ArrayList;
import java.util.List;

public class PizzaOrder {
		 private double totalOrderCost;

	        private final ArrayList<Pizza> pizzas;

	        public PizzaOrder(ArrayList<Pizza> pizzas) {
	            this.pizzas = pizzas;
	        }
	        public double getTotalOrderCost() {
	            return totalOrderCost;
	        }
	        public void setTotalOrderCost(double totalOrderCost) {
				this.totalOrderCost = totalOrderCost;
			}

	        public void calculatebillamount() {
	            final double LARGE_COST = 300;
	            final double MEDIUM_COST = 200;
	            final double REGULAR_COST = 100;
	            final double COST_PER_TOPPING = 30;

	            for (Pizza pizza : pizzas) {
	                switch (pizza.getSize()) {
	                    case "Large":
	                        totalOrderCost += LARGE_COST;
	                        break;
	                    case "Medium":
	                        totalOrderCost += MEDIUM_COST;
	                        break;
	                    case "Small":
	                        totalOrderCost += REGULAR_COST;
	                        break;
	                    default:
	                        totalOrderCost += 0.0;
	                        break;
	                }

	                int totalToppings = pizza.getToppings().size();
	                totalOrderCost += totalToppings * COST_PER_TOPPING;
	                
	            }
	        }

	        
			public void printOrderSummary() {
	            for (Pizza pizza : pizzas) {
	                System.out.println("Ordered a: " + " "+pizza.getSize() );
	                System.out.println( " pizza with: " +   " "+ pizza.getToppings());
	                System.out.println("type of crust:"+" " +pizza.getCrust());
	                System.out.println("sides:"+" "+pizza.getSides());
	                System.out.println("extra cheese:"+ " "+ pizza.getExtraCheese());
	            }
	            System.out.println("TOTAL ORDER AMOUNT: " + getTotalOrderCost());
	        }
		
	}
	
	
	

	
