package exerciciosSequenciais;

import java.util.*;

public class Ex6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double A, B, C;
		double pi = 3.14159;
		
		System.out.println("Digite A:");
		A = sc.nextDouble();
		System.out.println("Digite B:");
		B = sc.nextDouble();
		System.out.println("Digite C:");
		C = sc.nextDouble();
		
		double areaTrianguloRet = A * C/2;
		double areaCircle = pi * (C * C);
		double areaTrapezio = (A + B) * C / 2;
		double areaQuadrado = B * B;
		double areaRetangulo = A * B;
		
		
		System.out.printf("TRIANGULO: %.3f%n", areaTrianguloRet);
		System.out.printf("CIRCULO: %.3f%n", areaCircle);
		System.out.printf("TRAPEZIO: %.3f%n", areaTrapezio);
		System.out.printf("QUADRADO: %.3f%n", areaQuadrado);
		System.out.printf("RETANGULO: %.3f%n", areaRetangulo);

		
		sc.close();
	}

}
