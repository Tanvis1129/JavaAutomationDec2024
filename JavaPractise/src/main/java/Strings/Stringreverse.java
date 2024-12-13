package Strings;

public class Stringreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		 String str="Tanvi";
		 
		 char[] ch=str.toCharArray();
		 
		 for(char c:ch) {
			 System.out.println(c);
		 }
		System.out.println();
		
		 for(int i=ch.length-1;i>=0;i--)
		 {
			 System.out.print(ch[i]);
		 }
		System.out.println();
		
		
		for(int k=str.length()-1; k>=0;k--)
		{
			System.out.print(str.charAt(k));
		}
	}

}
