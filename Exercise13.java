import java.util.Scanner;
public class Exercise13{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str;
		System.out.println("Enter string:");
		str=sc.nextLine();		
		int l=str.length();
		if (l%2==0)
			System.out.println(str.substring(0,l/2));
		else
			System.out.println("null");
}
}
