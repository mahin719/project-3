package practicejava;

public class inheritanceConcept {
//	Inheritance
//	In Java, it is possible to inherit attributes and methods from one class to another.
	
//subClass(Child): the class which inharit something from other class	
//SuperClass(Parent class):	the class being inherited from
	
	//To inherit from a class, use the extends keyword.


	public void Methodone() {
		//typeuser lid(1234)
		//type pw
		//click login
		System.out.println("This is a public method from inharite class");
	}
	
	//we dont need to create any object to access static method
	 static void Methodtwo() {
		System.out.println("This is a public static method from inharite class");
	}
	
	
	protected void Methodthree() {
		System.out.println("This is a protected method from inharite class");
		

	}

}
