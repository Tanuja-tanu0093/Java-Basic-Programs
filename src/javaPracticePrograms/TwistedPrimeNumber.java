package javaPracticePrograms;

import java.util.Scanner;

public class TwistedPrimeNumber {
	public static int countOfFactors(int num) {
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;

			}
		}
		return count;
	}

	public static int reverseNumber(int num) {
		int reverse = 0;
		while (num > 0) {
			int last_digit = num % 10;
			reverse = reverse * 10 + last_digit;
			num = num / 10;
		}
		return reverse;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int number = sc.nextInt();
		if (countOfFactors(number) == 2 && reverseNumber(countOfFactors(number)) == 2) {
			System.out.println("The number= " + number + " is a Twisted Prime Number");
		} else {
			System.out.println("The number= " + number + " is not a Twisted Prime Number");
		}
	}
}
