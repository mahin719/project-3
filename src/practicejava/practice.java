package practicejava;

public class practice {

	public static void main(String[] args) {
		//Iam from Bangladesh
		
		String x = "Iam from Bangladesh";
		x.length();
		System.out.println(x.length());
		System.out.println(x.length()+ " Length");
		System.out.println(x.indexOf('f'));
        System.out.println(x.indexOf('h'));
        
        int y = x.length();
        System.out.println(y-1+ " Max index");
        
        System.out.println("*********");
 
        //HOMEWORK
        
        String m = "My name is Khan";
        m.length();
        System.out.println(m.length());
		System.out.println(m.length()+ " Length");
		System.out.println(m.indexOf('K'));
		System.out.println(m.indexOf('n'));
   
        int n = m.length();
        System.out.println(n-1+ " Max index");
        
        x.toUpperCase();
        System.out.println(x.toUpperCase());
        System.out.println(x.toLowerCase());
       
        int a = Math.addExact(1, 2);
        System.out.println(Math.addExact(1, 2));
        System.out.println(a);
        
        int b = Math.floorDiv(4, 2);
        System.out.println(b);
        
        int c = Math.subtractExact(5, 4);
        System.out.println(c);
        
        System.out.println("The value of Pi is = " + Math.PI);
        
        int d = Math.max(10,20);
        System.out.println("The bigger number is " + d );
        
        int e = Math.min(40, 50);
        System.out.println("the smaller number is " + e);
        
        
        
         

	}

}
