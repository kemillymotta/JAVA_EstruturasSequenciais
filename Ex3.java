package exerciciosSequenciais;

import java.util.*;

public class Ex3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A, B, C, D;
		
		System.out.println("Digite quatro valores: ");
		A = sc.nextInt();	
		B = sc.nextInt();		
		C = sc.nextInt();		
		D = sc.nextInt();		
		
		int diferenca = (A * B - C * D);
		
		System.out.println("A diferença de A e B pelo produto de C e D é = " + diferenca);

		sc.close();

	}

}
