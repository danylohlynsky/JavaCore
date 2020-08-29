package tasks5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] number = new int[5];
		for (int i = 0; i < number.length; i++) {
			number[i] = Integer.parseInt(br.readLine());
		}
		int amount=0;
		for (int i = 0; i < number.length; i++) {
			if (number[i]>0) {
				amount++;
			}
			if (amount == 2) {
				System.out.println("Position of second positive number is: " + i);
				break;
			}
		}
		if (amount < 2) {
			System.out.println("There is no 2 positive numbers");
		}
		
		int min = number[0];
		int minPosition = 0;
		for (int i = 1; i < number.length; i++) {
			if (number[i-1]>number[i]) {
				min = number[i];
				minPosition = i;
			}
		}
		System.out.println("Minimum is " + min + " on " + minPosition + " position");
		
		
	}

}
