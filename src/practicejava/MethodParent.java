package practicejava;

public class MethodParent {
	
	//1. create a method with no return type no input parameter
		//Syntex for creating a method
		
		public void QAClass (){
			 System.out.println("Adib");
			 System.out.println("Mahin");
			 System.out.println("Babu");
			 	 
			  } 
		
		//2.no input, yes return
		//no input means we are not passing any argument
		
		public int summetion() {
			int a=5;
			int b=10;
			int c=a+b;
			
		return c;
				
		}
		
		//3. yes return and yes input
		public int addition(int a, int b, int z, int p) {
			int c=(a+b+z)-p;
			return c;
		}
			
		//create 3 types of method, 
		// create a method to substract two number, multiply two numbers, divide two numbers
			
		
		//a method with no return type no input parameter
			
			public void information (){
				 System.out.println("First Name");
				 System.out.println("Last Name");
				 System.out.println("Date Of Birth");
				 	 
				  } 
				
			//2.no input, yes return

			public int time() {
				int second=1;
				int minute= second * 60;
				int hour= minute * 60;
				
			return hour;
					
			}
			
			//3. yes return and yes input
			
			public int Subtract(int a, int b) {
				int c=(a-b);
				return c;
			}
			
			public int Multiplication(int a, int b) {
				int c=(a * b);
				return c;
			}
			
			public int Division(int a, int b) {
				int c=(a / b);
				return c;
			}
			
			
			public int abcd  (int x, int y){
				 
				 int c = (x+y);
				 return c;
				 	 
				  } 
			
		
			
			
}
