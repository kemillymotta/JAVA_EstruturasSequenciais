package exerciciosSequenciais;

import java.util.*;

public class Ex4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num, horas;
		double valor, salary;
		
		System.out.println("Número do funcionário: ");
		num = sc.nextInt();
		
		System.out.println("Horas trabalhadas: ");
		horas = sc.nextInt();
		
		System.out.println("Valor por horas: ");
		valor = sc.nextDouble();
		
		salary = valor * horas;
		
		System.out.printf("O valor do salário do funcionário %d é = U$ %.2f", num, salary);
		
		sc.close();
	}

}
