package br.com.residencia.poo.exerciciosdois;

import java.util.Scanner;

public class ExercicioListaCinco {

	public static void main(String[] args) {
		int expA;
		double expB;
		Scanner sc = new Scanner(System.in);

		expA = 2 + 3 - (5 * 8) - 4 + 354 - 521 + (7 * 66);
		expB = 2 + 7 * (14 - 21) + 28 * 3 * 42 + 740 - (156 + 4 + 40) * 9;

		System.out.println("O resultado da expressão A é: " + expA);
		System.out.println("O resultado da expressão B é: " + expB);

		sc.close();
	}
}