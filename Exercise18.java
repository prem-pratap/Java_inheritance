import java.util.Scanner;
public class Exercise18{
	public static void main(String[] args){
		String str1,str2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first string:");
		str1=sc.nextLine();

		System.out.println("Enter second string:");
		str2=sc.nextLine();

		//alternative merge string
		StringBuffer result=new StringBuffer();
		for(int i=0;i<str1.length() || i<str2.length();i++){
			//appending character from first string
			if(i<str1.length())	
				result.append(str1.charAt(i));
			//appending character from second string
			if(i<str2.length())	
				result.append(str2.charAt(i));
			}
		
		System.out.println(result);
		}
}
