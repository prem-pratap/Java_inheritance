import java.util.Scanner;
public class Exercise11{
	public static void main(String[] args){
		String str1,str2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first string:");
		str1=sc.nextLine();

		System.out.println("Enter second string:");
		str2=sc.nextLine();
		int l1=str1.length();
		if(str1.charAt(l1-1)==str2.charAt(0)){//comparing last character of first string  and first character of second string
			String res=str1+str2.substring(1);
			System.out.println(res.toLowerCase());}

		else
			System.out.println((str1+" "+str2).toLowerCase());



		}






}
