package tasks4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class task1 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Write 1st number:");
		float n1 =  Float.parseFloat(br.readLine());
		System.out.println("Write 2nd number:");
		float n2 =  Float.parseFloat(br.readLine());
		System.out.println("Write 3rd number:");
		float n3 =  Float.parseFloat(br.readLine());
		boolean check = true;
		if ((n1>=-5) && (n1<=5) && (n2>=-5) && (n2<=5) && (n3>=-5) && (n3<=5)) {
			check = true;
		} else {
			check = false;
		}
		System.out.println(check);
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		System.out.println("Write 4th number:");
		int n4 = Integer.parseInt(br.readLine());
		System.out.println("Write 5th number:");
		int n5 = Integer.parseInt(br.readLine());
		System.out.println("Write 6th number:");
		int n6 = Integer.parseInt(br.readLine());
			if ((n4 > n5) && (n4 > n6)) {
				System.out.println("max=" + n4);
			} else if ((n5 > n4) && (n5 > n6)) {
				System.out.println("max=" + n5);
			} else {
				System.out.println("max=" + n6);
			}

			if ((n4 < n5) && (n4 < n6)) {
				System.out.println("min=" + n4);
			} else if ((n5 < n4) && (n5 < n6)) {
				System.out.println("min=" + n5);
			} else {
				System.out.println("min=" + n6);
			}
			
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("Error (chose from: 400, 401, 402):");
		int error = Integer.parseInt(br.readLine());
		
		HTTPError errorName = null;
		System.out.println(errorMethod(error, errorName));
		
	}
	public static HTTPError errorMethod(int error, HTTPError errorName) {
		switch (error) {
		case 400:
			errorName = HTTPError.BadRequest;
			break;
		case 401:
			errorName = HTTPError.Unauthorized;
			break;
		case 402:
			errorName = HTTPError.PaymentRequired;
			break;
		}
		return errorName;
	}
}