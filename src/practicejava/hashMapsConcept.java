package practicejava;
import java.util.HashMap;
public class hashMapsConcept {



	public static void main(String[] args) {
		//HashMap (Key, Value)
		
		HashMap<String, String> capitalCities = new HashMap<String, String>();
		
	// HashMap<String, String> capitalCities = new HashMap<>(); (no need to write data type after =)
		
		//objectname.put(key, value);
		capitalCities.put("USA", "DC");
		capitalCities.put("BD", "Dhaka");
		System.out.println(capitalCities);
		
		capitalCities.get("USA");
		System.out.println(capitalCities.get("USA"));
		System.out.println("******************");
		
		
		HashMap<String, Character> grades = new HashMap<>();
		
		grades.put("Adib", 'A');
		grades.put("Sheikh", 'B');
		grades.put("Mahin", 'C');
		
		System.out.println(grades);
		
		//get one element
		
		System.out.println(grades.get("Mahin"));
		
		//size of a HashMap
		
		System.out.println(grades.size());
		
		//check if an element exist or not
		
		System.out.println(grades.containsKey("Adib"));
		System.out.println(grades.containsValue('B'));
		
		//replace
		
		grades.replace("Sheikh", 'A');
		System.out.println(grades);
		
		//if this element does not exist then add it
		
		grades.putIfAbsent("Ghalib", 'D');
		System.out.println(grades);
		
		//remove an element
		
		grades.remove("Ghalib");
		System.out.println(grades);
		
		
		//delete all the value
		//System.out.println(grades.clear());
		

	}

}
