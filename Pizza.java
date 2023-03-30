package pizzaapp;

import java.util.ArrayList;

public class Pizza {
	  private String size;
	  private ArrayList<String> toppings;
      private String crust;
      private String sides;
      private String extraCheese;
      private String typeofpizza;
      private String nameofpizza;
      
	
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public ArrayList<String> getToppings() {
		return toppings;
	}
	public void setToppings(ArrayList<String> toppings) {
		this.toppings = toppings;
	}
	public String getCrust() {
		return crust;
	}
	public void setCrust(String crust) {
		this.crust = crust;
	}
	public String getSides() {
		return sides;
	}
	
	public void setSides(String sides) {
		this.sides = sides;
	}
	
	public String getExtraCheese() {
		return extraCheese;
	}
	public String getTypeofpizza() {
		return typeofpizza;
	}
	public void setTypeofpizza(String typeofpizza) {
		this.typeofpizza = typeofpizza;
	}
	public String getNameofpizza() {
		return nameofpizza;
	}
	public void setNameofpizza(String nameofpizza) {
		this.nameofpizza = nameofpizza;
	}
	public void setExtraCheese(String extraCheese) {
		this.extraCheese = extraCheese;
	}
	public Pizza(String size, ArrayList<String> toppings, String crust, String sides,String typeofpizza, String nameofpizza) {
		super();
		this.size = size;
		this.toppings = toppings;
		this.crust = crust;
		this.sides = sides;
		this.typeofpizza = typeofpizza;
		this.nameofpizza = nameofpizza;
	}
	public Pizza() {
		// TODO Auto-generated constructor stub
	}
	public Pizza(String size2, String crust2, String sides2, String typeofpizza2, String nameofpizza2) {
		this.size=size2;
		this.crust=crust2;
		this.sides=sides2;
		this.typeofpizza=typeofpizza2;
		this.nameofpizza=nameofpizza2;
	}
	
}
	
	
	
	
      


