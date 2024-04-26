package practicejava;

public class loopCircle {

	public static void main(String[] args) {
		//for loop
		
		int a;
		for(a=1;a<=10;a=a+2 ) {
			System.out.println("The odd number is " + a);
		}
		
		System.out.println("*************************");
		
		//while loop
		//print 1 to 10
		
		int b=1;
		while(b<=10) {
			System.out.println(b);
			b++;
			//b=b+2; (this can be used too)
		}
		
		System.out.println("***********************");
		//do while loop
		
		int x = 11;
		do {
			System.out.println(x);
			x++;
		} while (x<=10);
		
		System.out.println("***********************");
		
		// print from 0 to -10; using while loop, for loop and do while
		
		//while loop
		int w=0;
		while(w>=-10) {
			System.out.println(w);
			w=w-1;
		}
		System.out.println("***********************");
		
		//for loop
		int f;
		for(f=0;f>=-10;f=f-1 ) {
			System.out.println(f);
		}
		System.out.println("***********************");
		
		//do while loop
		int dw = 0;
		do {
			System.out.println(dw);
			dw=dw-1;
		} while (dw>=-10);
		
		System.out.println("***********************");
		
		//print odd and even numbers using do while loop
		
		int odd = 1;
		do {
			System.out.println(odd);
			odd=odd +2;
		} while (odd<=10);
		
		System.out.println("***********************");
		
		int even = 2;
		do {
			System.out.println(even);
			even=even+2;
			} while (even<=10);

	}

}
