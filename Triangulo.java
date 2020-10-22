package ejerciciosEntornos;

import java.util.Scanner;

public class Triangulo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca la altura: ");
		double altura = sc.nextDouble();
		System.out.println("Introduzca la base: ");
		double base = sc.nextDouble();
		sc.close();
		double area = (base * altura) / 2;
		System.out.println("El area del triángulo es: " + area);
	}
}
