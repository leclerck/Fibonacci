package fibonacci;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number between 1 and 46: ");
		try {
			int num = sc.nextInt();
			fibonacci(num);
		} catch (InputMismatchException e) {
			System.out.println("Error: " + e);
		} finally {

			sc.close();
		}
	}

	public static void fibonacci(int num) {
		System.out.println("The first " + num + " elements of the Fibonacci sequence are:");
		if (num <= 46 && num >= 1) {
			int fib1 = 1;
			int fib2 = 1;
			if (num == 1) {
				System.out.println(fib1);

			} else if (num > 1) {
				System.out.println(fib1);
				System.out.println(fib2);
			}

			for (int i = 2; i < num; i++) {
				int fib3 = fib1 + fib2;
				System.out.println(fib3);
				fib1 = fib2;
				fib2 = fib3;
			}
		} else {
			System.out.println("Error: Input should be between 1 and 46");
		}
	}

}
