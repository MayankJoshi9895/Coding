package Basic;

import java.util.Scanner;

public class NumberOfPrime {

	public static void main(String[] args) {

		int total = 10;
		int count = 0;
		for (int i = 1; i <= total; i++) {
			
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if(count == 2) {
				System.out.println("This is Prime" + i);
			}else {
				System.out.println("This is not Prime" + i);
			}
			
			count = 0;
			
		}
	}
}
