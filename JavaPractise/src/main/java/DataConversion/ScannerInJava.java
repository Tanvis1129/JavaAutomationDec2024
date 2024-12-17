package DataConversion;
import java.util.Scanner;

public class ScannerInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Addition of 2 numbers
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st Number");
		
		int i=sc.nextInt();
		System.out.println("Enter second number");
		
		int j=sc.nextInt();
		System.out.println("Result : "+(i+j));
		
	}

}
