class BigB{
 void role(){
	System.out.println("My name is BigB");}
}



class Father extends BigB{

	void role(){
		System.out.println("My role is father when i am wiht my son");}

}


class Manager extends BigB{

	void role(){
		System.out.println("My role is MAnager when i am in company");}

}

class Driver extends BigB{

	void role(){
		System.out.println("My role is driver while i am driving");}

}

public class DynamicDispatch2{
	public static void main(String[] args){

	BigB v;
	v=new BigB(); v.role();
	v=new Father(); v.role();
	v=new Driver(); v.role();
	v= new Manager(); v.role();
	}


}
