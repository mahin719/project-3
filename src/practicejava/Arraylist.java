package practicejava;
import java.util.ArrayList;
import java.util.Arrays;

public class Arraylist {


	public static void main(String[] args) {
	

		
		ArrayList<String> cars = new ArrayList<>();
		
		//How to add values in an array list
		//variableName.add();
		
	cars.add("BMW");
	cars.add("Nissan");
	cars.add("Chevy");
	//How to print an arraylist
	
	System.out.println(cars);
	cars.add("Honda");
	System.out.println(cars);
	
	
	//we can replace a value in arraylist
	cars.set(0, "Merc");
	System.out.println(cars);
	cars.remove(2);
	System.out.println(cars);
	//how to get the size of Arraylist
	cars.size();
	System.out.println(cars.size());
	//cars.clear();
	System.out.println(cars);
	
	//how to print a single value of Array
	String a=cars.get(1);
	System.out.println(a);
	
	System.out.println("**************************");
	
	//The difference between Array and ArrayList
	
	//Declare and Array (Array has a fix size)
	String[] friendsArray = new String[4];
	//index is 0,1,2,3. 
	String[] friendsArray2 = {"A", "C", "D", "E"};
	
	//Declare an ArrayList
	ArrayList<String> friendsArrayList = new ArrayList<>();	
	ArrayList<String> friendsArrayList2 = new ArrayList<>(Arrays.asList("F", "G", "H", "I"));
	
	//Arraylist cant hold int. You have to use Integer. 
	
	//Get element
	System.out.println(friendsArray2[1]);
	System.out.println(friendsArrayList2.get(1));
	
	//Get size
	System.out.println(friendsArray2.length);
    System.out.println(friendsArrayList2.size()); //() coz this is a method call
	
	//you cant add or remove any items from Arrays
	//Add element
	friendsArrayList2.add("x");
	System.out.println(friendsArrayList2.get(4));
	
	//Set or Replace an element
	friendsArray2[0] = "Z";
	System.out.println(friendsArray2[0]);
	
	friendsArrayList2.set(0, "y");
	System.out.println(friendsArrayList2.get(0));
	
	//Remove an element (cant do on Arrays)
	
	friendsArrayList2.remove(0); // friendsArrayList2.remove("F"); same thing
	System.out.println(friendsArrayList2.get(0));
	
	
	//print
	System.out.println(friendsArray2); //It just gives u memory address
	System.out.println(friendsArrayList2);
	
	System.out.println("********************************************");
	
	ArrayList<Integer> numbers = new ArrayList<>();

    // Add elements to the ArrayList
    numbers.add(10);
    numbers.add(20);
    numbers.add(30);

    // Print the ArrayList using a while loop
    int index = 0;
    while (index < numbers.size()) {
        System.out.println("Element at index " + index + ": " + numbers.get(index));
        index++;
    }
	
	}

}
