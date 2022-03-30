package velocity;

import java.util.Scanner;

public class FindingSeason {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month;
		System.out.println("enter the month:");
		Scanner sc = new Scanner(System.in);
		month = sc.nextInt();
		if(month>=3&&month<=5)
			System.out.println("Spring");
		else if(month>=6&&month<=8)
			System.out.println("Summer");
		else if(month>=9&&month<=11)
			System.out.println("Autumn");
		else if(month<=2||month<=12)
			System.out.println("Winter");
		else
			System.out.println("invalid input");

	}

}
