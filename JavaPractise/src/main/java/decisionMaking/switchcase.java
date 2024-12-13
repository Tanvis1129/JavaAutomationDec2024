package decisionMaking;

public class switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//its good choice when thre are defined choices .


		int size=5;

		/*
		 1- ES
		 2- S
		 3- M
		 4 -L
		 5- EL
		 6-or any other - invalid size

		 */


		switch(size)
		{

		case 1:
			System.out.println("Extra small");
			break;

		case 2:
			System.out.println("small");


			break;

		case 3:
			System.out.println("medium");

			break;

		case 4:
			System.out.println("large");

			break;

		case 5:
			System.out.println("Extra large");

			break;

		default:
			System.out.println("invalid");




		}



	}

}
