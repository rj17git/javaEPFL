

import java.util.Scanner;

public class Degre3 {
	private static Scanner keyboard = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter a (int) : ");
		int a = keyboard.nextInt();
		System.out.println("Enter b (int) : ");
		int b = keyboard.nextInt();
		System.out.println("Enter c (int) : ");
		int c = keyboard.nextInt();
		System.out.println("Enter x (double) : ");
		double x = keyboard.nextDouble();
		
		double polynome = ((double)(a+b)/2)*x*x*x + (a+b)*(a+b)*x*x + a + b + c;
		
		System.out.println("Polynom value is : " + polynome);
	}
}
