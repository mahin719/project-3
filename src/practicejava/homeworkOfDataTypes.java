package practicejava;

public class homeworkOfDataTypes {

	public static void main(String[] args) {
		
		int bankBalance = 100;
		int deposit = 50;
		
		int updatedBalance = bankBalance + deposit;
		System.out.println("After the deposit your balance is: " + updatedBalance);
		
		int withdraw = 40;
		
		int newBalance = updatedBalance - withdraw;
		System.out.println("After the withdaw your balance is: " + newBalance);
		
		double cost = 10.5;
		double tax = .5;
		
		double totalcost = cost + cost*tax;
		System.out.println("The total price of this item is: " + totalcost);
		
		double bill = 75.25;
		int people = 4;
		double costAfterSplit = bill / people;
		System.out.println("After spliting the bill among 4 people the bill is: " + costAfterSplit);
		
		
		int flightCost = 500;
		int hotelCost  = 200;
		int foodCost   = 100;
		int budget    = 1000;
		
		boolean equalTo =  flightCost == hotelCost;
		System.out.println("The cost of flight and hotel are same " + equalTo);
		
		boolean notEqualTo = hotelCost != foodCost;
		System.out.println("The cost of hotel and food are not same " + notEqualTo);
		
		boolean greaterThan = flightCost >= hotelCost;
		System.out.println("The cost of flight is higher than hotel price " + greaterThan);
		
		boolean lessThan = (flightCost + hotelCost + foodCost) <= budget; 
		System.out.println("I can afford to go on this trip  " + lessThan);
		
		int a = 1;
		int b = 2;
		int c = 3;
		int d = 4;
		
		boolean andAnd = (a>b) && (c>d);
		System.out.println("example of && operator " + andAnd);
		
		boolean orOr = (a<b) || (c>d);
		System.out.println("example of || operator " + orOr);
		
		
	}

}
