package tasks5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Write the number of mounth");
		int n = Integer.parseInt(br.readLine());
		
		String[] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		System.out.println("In " + month[n-1] + " is " + days[n-1] + " days");
	}
}
