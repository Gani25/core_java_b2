package day5;

import java.util.Scanner;

// WAP to print fibonacci series till n
// n = 10
// 0 1 1 2 3 5 8 13 21 34 ....

public class For2 {

//	End / Array/Collection/String

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to display fibonacci sereis: ");
		int n = sc.nextInt();

		int n1 = 0, n2 = 1;

		if (n > 0) {
			System.out.println("Fibonacci series till " + n + ": ");
			if (n > 1) {
				System.out.print(n1 + " " + n2 + " ");

			} else {
				System.out.print(n1 + " ");

			}

		} else {
			System.out.println("Enter positive number to generate series");
		}

		for (int i = 3; i <= n; i++) {
			int n3 = n1 + n2;
			System.out.print(n3 + " ");

			// swap
			n1 = n2;
			n2 = n3;
		}
	}
}

/*
 * 
 * 1. WAP to check whether the number is Armstrong number or not
 * 2. WAP to check whether the number is a Prime number or not
 * 3. WAP to print series of prime number from 1 to n
 * 
 * */
