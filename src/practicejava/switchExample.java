package practicejava;

public class switchExample {

	public static void main(String[] args) {
		
		//case Value:
		//block of code
		//break;
		
		int Day = 3;
		switch (Day) {
		
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		}

		String day = "Monday";
		switch (day) {
		
		case "Monday":
			System.out.println("First day of the week");
			break;
		case "Tuesday":
			System.out.println("Second day of the week");
			break;
		case "Wednesday":
			System.out.println("Third day of the week");
			break;
			
		}
		
		String browserName = "Edge";
		switch (browserName.toLowerCase()) {
		case "chrome":
			System.out.println("CHROME");
			break;
			
		case "edge":
		   System.out.println("EDGE");
		   break;
		case "mozilla":
			System.out.println("MOZILLA");
			break;
		
		}
		
		
		
		
		
	}

}
