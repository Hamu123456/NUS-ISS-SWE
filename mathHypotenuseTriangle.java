package tutorial_1_d1;

import java.util.Scanner;

public class mathHypotenuseTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 3.14;
		double y = -10;
		
		double z = Math.max(x, y); // find out the max number 
		
		System.out.println(z);
		
		double a = Math.abs(y); // absolute value of number
		System.out.println(a);
		
		double b = Math.sqrt(a); // square root of a number
		System.out.println(b);
		
		double c = Math.round(x); // round off to nearest whole number
		System.out.println(c);
		
		double d = Math.ceil(x); // round off to next highest number
		System.out.println(d);
		
		double e = Math.floor(x); // round of to the lowest number
		System.out.println(e);
		
		double f = Math.pow(2, 3); // power function
		System.out.println(f);
		
		// Find the hypotenuse of a triangle
		double a1;
		double b1;
		double c1;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter side a1: ");
		a1 = scanner.nextDouble();
		System.out.println("Enter side b1: ");
		b1 = scanner.nextDouble();
		
		double Hypotenuse = Math.sqrt((Math.pow(a1, 2))+(Math.pow(b1, 2)));
		System.out.println("The hypotenuse of the triangle is: " + Hypotenuse);
		
		scanner.close(); // close the scanner
		

	}

}
