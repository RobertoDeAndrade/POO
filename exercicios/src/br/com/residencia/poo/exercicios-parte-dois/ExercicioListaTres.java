package br.com.residencia.poo.exerciciosdois;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExercicioListaTres {

	public static void main(String[] args) {
		int n1, n2, soma, sub, mult;
		double div;
		Scanner sc = new Scanner(System.in);

		try {
			
		System.out.print("Digite um número: ");
		n1 = sc.nextInt();
		System.out.print("Digite outro número: ");
		n2 = sc.nextInt();

		soma = n1 + n2;
		sub = n1 - n2;
		mult = n1 * n2;

		System.out.println("\nA soma entre " + n1 + " e " + n2 + " é: " + soma);
		System.out.println("A subtração entre " + n1 + " e " + n2 + " é: " + sub);
		System.out.println("A multiplicação entre " + n1 + " e " + n2 + " é: " + mult);

		if (n2 != 0) {
			div = (double) n1 / n2;
			System.out.println("A divisão entre " + n1 + " e " + n2 + " é: " + div);
		} else {
			System.out.println("A divisão entre " + n1 + " e " + n2 + " é: " + "Não é possível dividir por zero.");
		}

		}catch (InputMismatchException e) {
			System.out.println("Valor digitado inválido!");
		}
		sc.close();
	}
}