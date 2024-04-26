package practicejava;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayClass {

	public static void main(String[] args) {
		
		//datatype [] variablename = {"data1", "data2"};
		
		String [] car = {"BMW", "Toyota", "Nissan", "Chevy" };
		
		System.out.println(car[1]);
		
		car [1] = "Merc";
		System.out.println(car[1]);		
		
		System.out.println("************");
		
		String [] flower = {"Rose", "Sunflower", "Lavender"};
		System.out.println(flower[2]);
		
		flower [2] = "Nightqueen";
		System.out.println(flower[2]);
		
		System.out.println("************");
		
		//make it in while loop
		
		int i = 0;
		while(i<flower.length) {
		System.out.println("While loop " + flower[i]);
		i++;
		}	
		
		System.out.println("**************");
		
		//make it on for loop	
		
		int f;
		for(f=0; f<flower.length; f++) {
	    System.out.println("For loop " + flower[f]);
		}
		
		System.out.println("**************");
		
		// make it in for each loop
		
		for (String g : flower) {
			System.out.println("For each loop " + g);
		}
		
		
		
		System.out.println("**************");
		//ARRAYLIST HOMEWORK
		
		ArrayList<String> foods = new ArrayList<>(Arrays.asList("burger", "pizza", "fries", "soda"));
		System.out.println(foods);
		
		//foods.add("burger");
		//foods.add("pizza");
		//foods.add("fries");
		//foods.add("soda");
		//System.out.println(foods);
		
		//Get an element
		System.out.println("Getting the 2nd element from the list: " + foods.get(1));
		
		//Get size
		System.out.println("The amount of food items on the list are : " + foods.size());
		
		//add element
		foods.add("cake");
		System.out.println("The new food item that I want to add is : " + foods.get(4));
		System.out.println("The new updated menu is " + foods);
		
		//replace
		foods.set(3, "diet soda");
		System.out.println("Lets replace the soda with low calorie option: " + foods.get(3));
		System.out.println("The new updated menu is " + foods);
		
		//remove
		foods.remove(0);
		System.out.println("After removing burger, the new menu contains " + foods);
		
		System.out.println("**********************************************");
		
		//for loop to print ArrayList
		int menu;
		
		for (menu=0; menu<foods.size(); menu++) {
			System.out.println("List of the foods using for loop: " + foods.get(menu));
		}
		
		System.out.println("**********************************************");
		
		// while loop to print ArrayList
			
		System.out.println("Using while loop and check which food item belong to which element: ");
		
		Integer Menu = 0;
		
		while (Menu<foods.size()) {
				
		   System.out.println("Item number " + Menu + ": " + foods.get(Menu));
			Menu++;
		}
			
		System.out.println("**********************************************");
		
		// for each loop
		
		for (String MENU : foods) {
			System.out.println("We are using for each loop now: " + MENU);
		}
		
		
		
		
		
		}

	}


