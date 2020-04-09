class Person{
	String name;
	
	Person(){
	name="UNKNOWN";
	System.out.println("NAME IS UNKNOWN");}
	
	Person(String s){
	name=s;}
	void setName(String s){
	name=s;}
	String getName(){
	return name;}

}
