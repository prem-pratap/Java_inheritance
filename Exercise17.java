import java.util.Scanner;
public class Exercise17{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str;
		System.out.println("Enter string with * in it:");
		str=sc.nextLine();
		int id=str.indexOf('*');
		System.out.println(str.substring(0,id-1)+str.substring(id+2));
	}
}
			
