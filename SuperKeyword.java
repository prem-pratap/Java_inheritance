class A{
	int a=10;
}


class B extends A{
	int a=20;
	void show(int a){
	System.out.println("Arguement passed: "+a);
	System.out.println("Local variable of child class: "+this.a);
	System.out.println("Parent class variable: "+super.a);}
	}

public class SuperKeyword{
	public static void main(String[] args){
		B obj=new B();
		obj.show(30);


}
	

}
