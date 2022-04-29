package areaOfACircleJava;

import java.util.Scanner;

public class areaProgram {

	public static void main(String[] args) {
		//Area of circle = (Pi * r)^2 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the radius!");
		double radius = sc.nextDouble();
		
		System.out.println("The area of this circle is " +Math.PI * radius * radius);

	}

}
