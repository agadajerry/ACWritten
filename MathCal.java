package hospital_mgt;

import java.util.Scanner;

public class MathCal {

	//Instance variables
	private Scanner sc = new Scanner(System.in);
	private int numb1, numb2, sum = 0;
	private int realRand;
	private int sum_all_even = 0;

	//constructor method
	public MathCal() {
		// first method for num between 1000 and 9999
		number1000_9999();
		randNumberGen();
	}
	//this handle random number
	private void randNumberGen() 
	{
		do {
			System.out.println("Enter a number less than 90");
			numb2 = sc.nextInt();
			System.out.println("n1: "+numb2);

			for (int i = numb2; i <= 100; i++) {

				realRand = (int) (Math.random() * 100);

			}
			System.out.println("Random n2 = " + realRand);

			System.out.println("randNo/numb2 : " + String.format("%.2f", (double) realRand / numb2));

			// The sum of even integer from 1 to realrand
			for (int j = 1; j <= realRand; j++) {
				if (j % 2 == 0) {
					sum_all_even = sum_all_even + j;

				}
			}
			System.out.println("Sum of even between 1 to randNo: " + sum_all_even);
			System.out.print("\t\t\t\t\tBy JerrySoft");

		} while (numb2 > 90);

	}

	private void number1000_9999() 
	{
		System.out.println("Enter a number between 1000 and 9999");
		numb1 = sc.nextInt();
		if (numb1 < 1000 || numb1 > 9999) {
			System.out.println("Invalid!\nThe entered value is not in the range");
		} else {
			System.out.println(numb1 + " is within the range");
			// below code figure out the first digit in a given figure

			int firstDigit = numb1 / 1000;
			int lastDigit = numb1 % 10;
			sum = firstDigit + lastDigit;

			System.out.println(
					"First digit is: " + firstDigit + "\n The last digit is: " + lastDigit + "\nThe sum is: " + sum);

			// To check if numb1 is divisible by 3
			// A number is divisible by 3 if the sum of it digit is divisible by 5 eg 324

			if (sum % 3 !=0) {

				System.out.println(sum + " Is not divisible by 3");
			}

		}

	}

	public static void main(String[] args) {
		new MathCal();
	}

}
