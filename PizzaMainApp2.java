package pizzaapp;

import java.util.ArrayList;
import java.util.Scanner;

public class PizzaMainApp2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		structure s1=new structure();
		makeChange m1= new makeChange();
		ArrayList<String>topping=new ArrayList<>();
		// TODO Auto-generated method stub
		boolean status=true;
		while(status) {
			System.out.println("select user");
			System.out.println("1.admin");
			System.out.println("2.customer");
			int choice=sc.nextInt();
			if(choice==2) {
				 
					  s1.getmenu();	
			}
			else if(choice==1) {
				boolean wanttocontinue=true;
				while(wanttocontinue) {
					System.out.println("1.add new pizza");
					int mode=sc.nextInt();
					System.out.println("add size");
					String size=sc.next();
					System.out.println("add new crust");
					String crust=sc.next();
					System.out.println("add new sides");
					String sides=sc.next();
					System.out.println("add type of pizza");
					String typeofpizza=sc.next();
					System.out.println("add name of pizza");
					String nameofpizza=sc.next();
					
					if(mode==1) {
						m1.addpizza(size,crust, sides, typeofpizza, nameofpizza);
						System.out.println("new pizza added successfully");
					}
				}
				
			}
		}
         
		
			
	}
}