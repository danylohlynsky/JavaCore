package tasks5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task4 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int product = 1;
		while (true) {
			int number = Integer.parseInt(br.readLine());
			if (number <0) {
				break;
			}
			if (number%2==0) {
				product = product * number;
			}
		}
		System.out.println("Product of all odd elements is " + product);
	}

}
