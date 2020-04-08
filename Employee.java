class Employee extends Person{
	double annual_salary;
	int year;
	String insurance_num;
	
	Employee(){
		annual_salary=0;
		year=0;
		insurance_num=null;
		System.out.println("Object doesn't have any arguements and values are "+annual_salary+" "+year+" "+insurance_num);}
	
	Employee(double sal){
		annual_salary=sal;
		year=0;
		insurance_num=null;
		System.out.println("Constructor with one arguement and values are "+annual_salary+" "+year+" "+insurance_num);}

	Employee(double sal,int y){
		annual_salary=sal;
		year=y;
		insurance_num=null;
		System.out.println("Constructor with two arguement and values are "+annual_salary+" "+year+" "+insurance_num);}
	
	Employee(double sal,int y,String s,String str ){
		super(str);
		annual_salary=sal;
		year=y;
		insurance_num=s;
		System.out.println("Constructor with three arguement and values are "+annual_salary+" "+year+" "+insurance_num);}

	void setSalary(double sal){
		annual_salary=sal;}
	
	void setYear(int y){
		year=y;}

	void setInsurance(String str){
		insurance_num=str;}

	double getSalary(){
		return annual_salary;}
	
	int getYear(){
		return year;}

	String getInsurance(){
		return insurance_num;}
	
	public String toString(){
		return 	annual_salary+" "+year+" "+insurance_num;}


}
