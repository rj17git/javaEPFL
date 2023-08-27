

import java.util.Scanner;

public class Permutation {
	private static Scanner keyboard = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter x : ");
		int x = keyboard.nextInt();
		System.out.println("Enter y : ");
		int y = keyboard.nextInt();
		System.out.println("Before permutation :");
		System.out.println("x : " + x);
		System.out.println("y : " + y);
		int temp; // temporary variable to stock x value
		temp = x;
		x = y;
		y = temp;
		
		System.out.println("After permutation :");
		System.out.println("x : " + x);
		System.out.println("y : " + y);
	}
}
