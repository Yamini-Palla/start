package velocity;

import java.util.Scanner;

public class HighestPlacement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cse,ece,mech;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of students placed in CSE:");
		cse = sc.nextInt();
		System.out.println("Enter the no of students placed in ECE:");
		ece = sc.nextInt();
		System.out.println("Enter the no of students placed in MECH:");
		mech = sc.nextInt();
		System.out.println("highest placements");
		if(cse>=ece&&cse>=mech)
			System.out.println("CSE");
		else if(ece>=cse&&ece>=mech)
			System.out.println("ECE");
		else if(mech>=ece&&mech>=cse)
			System.out.println("MECH");
		else
			System.out.println("invalid input");
		
	}

}
