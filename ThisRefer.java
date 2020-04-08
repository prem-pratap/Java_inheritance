class example{
	int val;
	example(){
	this(10);
	System.out.println("The default value is "+val);}

	example(int n){
	val=n;
	System.out.println("One arguement constructor is "+val);
	}
}
public class ThisRefer{
	public static void main(String[] args){

	example obj=new example(); //this is used to call overloaded constructor here this(10) will call constructor with arguement

	

	}


}
