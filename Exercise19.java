import java.util.Scanner;
public class Exercise19{
	public static void main(String[] args){
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first string:");
		str=sc.nextLine();
		int n;
		System.out.println(str.lastIndexOf("ll"));
		System.out.println("Enter no. of characters you want from last of string:");
		n=sc.nextInt();
		if(str.length()>n)
			System.out.println((str.substring(str.length()-n)).repeat(n));			
		else
			System.out.println(str);
		}
}
