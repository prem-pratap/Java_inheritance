class Employ{
	int id;
	String name;
	int salary;  //id,name,salary are instance variables
	void setId(int i){
	id=i;}
	void setName(String s){
	name=s;}//s is arguement
	void setSalary(int sal){
	salary=sal;}
	void showSalary(){
	System.out.println(name+"'s salary is"+salary);}
}
public class EmployeeDemo{
	public static void main(String[] args){

	Employee emp=new Employee(); //creating object and its reference
	emp.setId(105);
	emp.setName("Rohit");
	emp.setSalary(20000);
	emp.showSalary();




}




}
