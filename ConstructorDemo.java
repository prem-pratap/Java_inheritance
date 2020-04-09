class sample{
	int val;
	sample(){
	//this(10);
	val=10;
	System.out.println("The default value is "+val);}

	sample(int n){
	val=n;
	System.out.println("One arguement constructor is "+val);
	}
}
public class ConstructorDemo{
	public static void main(String[] args){

	sample obj=new sample();
	sample obj2=new sample(125);

	

	}


}
