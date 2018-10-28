package main;

import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		while (true) {
			StringBuilder sb = new StringBuilder();
			
			System.out.print("Geben sie die Zeichenanzahl ein: ");
			int zeichen = Integer.parseInt(sc.nextLine());
			for (int i = 0; i < zeichen; i++) {
				char c = (char)((byte)(r.nextInt(93) + 33));
				sb.append(c);
			}
			System.out.println(sb.toString());
		}
	}
}