import java.util.Scanner;

public class Age {
	private static Scanner keyboard = new Scanner(System.in);

	public static void main(String[] args) {
		final int CURRENTYEAR = 2023;
		// ask user age
		System.out.println("Give your age : ");
		int age = keyboard.nextInt();
		int year = CURRENTYEAR - age;
		System.out.println("Your birth year is : " + year);
	}
}
