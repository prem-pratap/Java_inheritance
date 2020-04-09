class TestEmployee{
	public static void main(String[] args){
	//testing all constructors
	Employee emp1=new Employee();
	Employee emp2=new Employee(20000);
	Employee emp3=new Employee(25000,2018);
	Employee emp4=new Employee(24000,2019,"1234567","PREM PRATAP");
	
	//testing getters and setters
	emp3.setName("Rohit");
	emp3.setInsurance("4537478");
	System.out.println("Salary of emp3: "+emp3.getSalary());
	System.out.println("Year of emp3: "+emp3.getYear());
	System.out.println("Name of emp3 "+emp3.getName());
	System.out.println("Insurance number of emp3 "+emp3.getInsurance());
	//setting values for emp2 and emp1
	emp2.setName("Shivam");
	emp2.setYear(2016);
	emp2.setInsurance("93836484");
	emp1.setName("Mayank");
	emp1.setSalary(21000);
	emp1.setYear(2019);
	emp1.setInsurance("15738390");
	System.out.println("All employee details are:");
	System.out.println(emp1.getName()+emp1);
	System.out.println(emp2.getName()+emp2);
	System.out.println(emp3.getName()+emp3);
	System.out.println(emp4.getName()+emp4);

}




}
