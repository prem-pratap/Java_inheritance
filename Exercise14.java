import java.util.Scanner;
public class Exercise14{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str;
		System.out.println("Enter string:");
		str=sc.nextLine();	
		int l=str.length();
		System.out.println(str.substring(1,l-1));

	}

}
