public class Exercise10{
	public static void main(String[] args){

		if(args.length==0)
			System.out.println("Please pass a word as arguement");
		else{
			String str=new String(args[0]);
			String rev="";
			int len=str.length();
			System.out.println(str);
			for(int i=len-1;i>=0;i--)
				rev=rev+str.charAt(i);
			if(str.equalsIgnoreCase(rev))
				System.out.println(str+" is pallindrome");
			else
				System.out.println(str+" is not pallindrome");
		}
	}
}
