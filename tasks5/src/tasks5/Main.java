package tasks5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Car[] c = new Car[4];
		c[0] = new Car("Honda", 2010, 150);
		c[1] = new Car("Mersedes", 2018, 600);
		c[2] = new Car("Hundai", 2007, 400);
		c[3] = new Car("VOLGA", 1939, 40);

		System.out.println("Car's year (1939, 2007, 2010, 2018)");
		int y = Integer.parseInt(br.readLine());
		
		boolean t = false;
		for (int i = 0; i < c.length; i++) {
			if (c[i].getYear() == y) {
				System.out.println(c[i]);
				t = true;
			}
		}
		if (t==false) {
			System.out.println("There is no car from " + y + " year");
		}
		System.out.println();
		Car tmp;
		for (int i = 0; i < c.length; i++) {
			for (int j = i + 1; j < c.length; j++) {
				if (c[i].getYear() < c[j].getYear()) {
					tmp = c[i];
					c[i] = c[j];
					c[j] = tmp;
				}
			}
		}
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
}
}
