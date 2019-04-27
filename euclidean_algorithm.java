package mathematicalPrograms;

import java.util.Scanner; // imports Scanner class

public class euclidean_algorithm {
	static Scanner sc = new Scanner(System.in); 

	public static int GCF(int num1, int num2) {
		// function 'GCF' which takes in 2 numbers as input, and returns an integer
		if(num2 == 0) {
			return num1;
			// the GCF of two numbers is the value of the first number (num1) when the second number (num2) is 0
		} else {
			return GCF(num2, num1 % num2);
			// the process of determining the next iteration of the algorithm whilst num2 is not 0
			//sets num1 = num2 and num2 = num1 % num2
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			while(true) {
				// allows for there to be multiple lines of user input w/o restarting the program
				System.out.println("Please enter 2 positive integers.");
				int a = sc.nextInt();
				int b = sc.nextInt();
				System.out.println("The greatest common factor of " + a + " and " + b + " is: " + GCF(a,b) + "\n" );
			}
		}catch(java.util.InputMismatchException ex) {
			System.out.println("Your number(s) must be less than 2,147,483,648.");
			// inputted numbers must be less than 2^32
		}
	}
}
