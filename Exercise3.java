import java.util.Scanner;
class Patient{
	String patientName;
	double weight,height;
	
	Patient(String name, double w,double h){
	patientName=name;	
	weight=w;
	height=h;
	}

	double computeBMI(){
		return (weight/(height*height));
	}

}

public class Exercise3{
	public static void main(String[] args){
	Scanner sc= new Scanner(System.in);
	//taking patient name as input
	System.out.println("Please enter name of patient:");
	String name=sc.nextLine();
	//taking weight and height as input to calculate BMI
	System.out.println("Please enter weight in kg and height in metres respectively:");
	
	double n1=sc.nextDouble();
	double n2=sc.nextDouble();
	double BMI;
	Patient p1=new Patient(name,n1,n2);
	BMI=p1.computeBMI();
	System.out.println("The BMI of Patient "+name+" is "+BMI); 

	}

}
