package practicejava;

public class MethodConcept {

	public static void main(String[] args) {
		//created an object of parent class
				MethodParent StdName=new MethodParent();
				StdName.QAClass();
				//StdName.summetion();
				
				int a=StdName.summetion();
				int z= a+100;
				System.out.println(z);
				
				
				int p= StdName.addition(100,200,300,600);
				
				System.out.println(p);
				
				System.out.println("**********homework*************");
				
				//System.out.println(StdName.addition(1200, 1000,1500));
				
				//HOMEWORK
				
				
				MethodParent info = new MethodParent();
				
				info.information();
				
				System.out.println("*************************");
				
				int i = info.time();
				System.out.println("1 hour = " + i + " seconds");
				
				int x = i * 2;
				System.out.println("2 hour = " + x + " seconds");
				
				System.out.println("*****************************");
				
				int sub = info.Subtract(10, 5);
				System.out.println("The substraction will be: " + sub);
				
				int multi = info.Multiplication(10, 5);
				System.out.println("The multiplication will be: " + multi);
				
				int div = info.Division(10, 5);
				System.out.println("The division will be: " + div);
				
				System.out.println("****************");
				
				MethodParent xyz = new MethodParent();
				xyz.abcd(x, div);

	}
	
	
}

