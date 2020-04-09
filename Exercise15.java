import java.util.Scanner;
public class Exercise15{
	public static void main(String[] args){
		String str1,str2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first string:");
		str1=sc.nextLine();

		System.out.println("Enter second string:");
		str2=sc.nextLine();

		//checking short and long string between the two strings
		if(str1.length() > str2.length())
        		System.out.println(str2+str1+str2);
        	else
        		System.out.println(str1+str2+str1);
	}
}
