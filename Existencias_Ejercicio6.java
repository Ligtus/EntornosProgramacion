package ejerciciosEntornos;

import java.util.Scanner;

public class Existencias_Ejercicio6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int existencias = 3200, entregadas;
		while(existencias >= 100) {
			System.out.println("Seleccione el número de existencias a pedir: ");
			entregadas = sc.nextInt();
			existencias -= entregadas;
			System.out.println("Existencias actuales: " + existencias);
		}
		System.out.println("No existen existencias disponibles.");
		sc.close();
	}
}
