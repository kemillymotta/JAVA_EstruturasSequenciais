package exerciciosSequenciais;

import java.util.*;

public class Ex5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		double v1, v2, soma;
		int p1, n1, p2, n2;

		p1 = sc.nextInt();
		n1 = sc.nextInt();
		v1 = sc.nextDouble();
		
		

		p2 = sc.nextInt();
		n2 = sc.nextInt();
		v2 = sc.nextDouble();
		
		soma = (n1 * v1) + (n2 * v2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", soma);
		
		
		sc.close();

	}

}
