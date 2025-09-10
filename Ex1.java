package exerciciosSequenciais;

import java.util.*;

public class Ex1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("Digite um numero: ");
		a = sc.nextInt();
		System.out.println("Digite um numero: ");
		b = sc.nextInt();
				
		System.out.printf("SOMA = %d%n", (a+b));
		
		sc.close();
	}

}
