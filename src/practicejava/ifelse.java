package practicejava;

public class ifelse {

	public static void main(String[] args) {
		
		double x = 3.5;
		double y = 3.5;
		
		if (x==y) {
			
			System.out.println("x and y is equal");
		}
		
		else {
			System.out.println("x and y is not equal");
		}
		
		
		int a = 10;
		int b = 50;
		
		if (b>a) {
			System.out.println("We can do it");
		}
		
		else {
			System.out.println("We can not do it");
		}
		
		
		int age = 20;
		
		if (age>18 && age<21) {
			System.out.println("We can drive");
		}
		
		else if (age>21 && age<65) {
			System.out.println("We can drink and drive");
		}
		
		else if (age>65 && age<85) {
			System.out.println("We can drink");
		}
		else if (age<18) {
			System.out.println("We can not do anything");
		}
		else {
			System.out.println("RIP");
		}
		
		
		
		int testScore = 85;

		if (testScore >= 90) {

		  System.out.println("A");

		} else if (testScore >= 80) {

		  System.out.println("B");

		} else if (testScore >= 70) {

		  System.out.println("C");

		} else if (testScore >= 60) {

		  System.out.println("D");

		} else {

		  System.out.println("F");		
		}
		
		
		int g = 200;
		
		if (g>=90 && g<=100) {
			System.out.println("A");
		}
		else if (g>=80 && g<90) {
			System.out.println("B");
		}
		else if (g>=70 && g<80) {
			System.out.println("C");
		}
		else if (g>=60 && g<70) {
			System.out.println("D");
		}
		else if (g>=0 && g<60) {
			System.out.println("F");
		}
		else {
			System.out.println("You have entered an invalid number");
		}
	
			
			
	}

}
