package velocity;

import java.util.Scanner;

public class BillGeneration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double pizza,puff,cooldrink;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the no of pizzas bought");
	pizza = sc.nextDouble();
	System.out.println("enter the no of puffs bought");
	puff = sc.nextDouble();
	System.out.println("enter the no of cool drinks bought");
	cooldrink = sc.nextDouble();
	double Total_price = pizza*100+puff*20+cooldrink*10;
	System.out.println("Bill details");
	System.out.println("no of pizzas"+pizza);
	System.out.println("no of puffs:"+puff);
	System.out.println("no of cooldrinks:"+cooldrink);
	System.out.println("total price="+Total_price);
	System.out.println("ENJOY THE SHOW!!!");
	

	}

}
