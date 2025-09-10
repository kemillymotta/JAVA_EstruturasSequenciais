package exerciciosSequenciais;

import java.util.*;

public class Ex2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double raio = 0;
		double pi = 3.14159;
		System.out.println("digite o raio:");
		raio = sc.nextDouble();
		
		double area = pi * raio * raio;
		System.out.printf("A = %.4f%n", area);
		
		sc.close();

	}

}
