class Animal{
	void eat(){
		System.out.println("This is eat method");
	}

	void sleep(){
		System.out.println("This is sleep method");
	}

}

class Bird extends Animal{
	void fly(){
	System.out.println("This is fly method");
	}

}


public class Exercise5{
	public static void main(String[] args){
		Animal ani=new Animal();
		System.out.println("Calling of methods using object of animal class");
		ani.eat();
		ani.sleep();
		Bird obj=new Bird();
		System.out.println("Calling of methods using object of bird class");
		obj.eat();
		obj.sleep();
		obj.fly();
	}
	
}



