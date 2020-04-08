import java.util.Scanner;
public class Exercise20{
	public static void main(String[] args){
		String str1,str2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first string:");
		str1=sc.nextLine();

		System.out.println("Enter second string:");
		str2=sc.nextLine();
		
		int startindex,lastindex;
//		startindex=str1.indexOf(str2);
//		lastindex=st1.lastIndexOf(str2);
		int x=str1.length()-str2.length()-1;
		if (str1.startsWith(str2) && str1.endsWith(str2))
			System.out.println(str1.charAt(x));
		
		else
			System.out.println("Else");
}
}
