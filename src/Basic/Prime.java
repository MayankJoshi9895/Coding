package Basic;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {

		int n, count = 0;

		System.out.println("Please Enter One Number:- ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			if (n % i == 0) {
				count++;
			}

		}
		
		
		if(count == 2) {
			System.out.println("This is Prime Number");
		}else {
			System.out.println("This is Prime not Number"); 

		}

	}

}
