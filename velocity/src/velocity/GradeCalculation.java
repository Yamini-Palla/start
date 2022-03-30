package velocity;

import java.util.Scanner;

public class GradeCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double Total_marks,marks_obtained;
		System.out.println("enter total marks");
		Total_marks = sc.nextInt();
		System.out.println("enter marks obtained");
		marks_obtained = sc.nextInt();
		
		double percent=(marks_obtained/Total_marks)*100;
		String grade;
		if(percent>=70)
			grade="A";
		else if(percent>=50)
			grade="B";
		else if(percent>=40)
			grade="C";
		else
			grade="fail";
		System.out.println(percent);
		System.out.println("your grade"+grade);
			
		

	}

}
