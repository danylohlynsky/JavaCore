package tasks5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] number = new int[10];
		for (int i = 0; i < number.length; i++) {
			number[i] = Integer.parseInt(br.readLine());
		}
		int sum =  0;
		int product = 1;
		boolean t = true;
		for (int i = 0; i < 5; i++) {
			if (number[i]>0) {
				sum = sum + number[i];			
			} else {
				t = false;
			}
			product = product*number[i+5];
		}
		
		if (t==true) {
			System.out.println("Sum of the first 5 numbers is " + sum);
		} else {
			System.out.println("Product of the last 5 numbers is " + product);
		}
		
	}
}
