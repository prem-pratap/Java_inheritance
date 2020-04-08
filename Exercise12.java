import java.util.Scanner;
public class Exercise12{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str;
		System.out.println("Enter string:");
		str=sc.nextLine();		
		int l=str.length();
		String sub=str.substring(0,2);
		System.out.println(sub);
		System.out.println(sub.repeat(l));

}



}
