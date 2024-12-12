package Loops;

public class forEachloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="my name is tanvi";
		
		/*
		 * for(int i=0; i<str.length(); i++) { System.out.println(str.charAt(i)); }
		 */
		for(char c: str.toCharArray()) {
			System.out.println(c);
		}
	}

}
