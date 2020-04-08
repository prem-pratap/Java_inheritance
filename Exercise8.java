class Fruit{
	String name;
	String taste;
	String size;

	Fruit(String name,String taste,String size){
	this.name=name;
	this.taste=taste;
	this.size=size;


	}
	void eat(){
	System.out.println("Fruit is "+name+" and taste is "+taste);}

}

class Apple extends Fruit{
	Apple(String s1,String s2, String s3){
		super(s1,s2,s3);			
		}

	void eat(){
	System.out.println("Fruit is "+name+" and its taste is "+taste);
	}

}


class Orange extends Fruit{
	Orange(String s1,String s2, String s3){
		super(s1,s2,s3);			
		}

	void eat(){
	System.out.println("Fruit is "+name+" and its taste is "+taste);
	}

}



public class Exercise8{
	public static void main(String[] args){

	Fruit f=new Fruit("Grapes","Sour","Small");
	Apple a=new Apple("Apple","Sweet","Round");
	Orange o=new Orange("Orange","Sweet/sour","Circular");
	Fruit fru;
	fru=a;
	fru.eat();
	fru=o;
	fru.eat();
	fru=f;
	fru.eat();
}

}
