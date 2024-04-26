package practicejava;

public class modifiers {
	
	//Modifier
		//Modifier is a keyword, which gives u access level or some special functionality
		//2 types of modifiers
		//Access Modifiers - controls the access level
		              //public=	The code is accessible from all classes	
		                        //in same class
		                        //in different clases in same package
		                       //in differnt class of other package


	public static void main(String[] args) {
		System.out.println("Public method got access");
		
	}

 //private=	The code is only accessible within the declared class	
                              //in same class

private void modPrivate() {
	System.out.println("Privae method got access");
}

       	//default	The code is only accessible in classes of same package. This is used when you don't specify a modifier. 	
 void modDefault() {
	 System.out.println("Default method got access");
}
 
 //protected=The code is accessible in the same package and subclasses. 




//Non-Access Modifiers - do not control access level, but provides other functionality. keyword: final




	}


