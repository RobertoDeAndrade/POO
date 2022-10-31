package br.com.residencia.poo.exerciciosdois;

import java.util.Scanner;

public class ExercicioListaDois {

	public static void main(String[] args) {
		int idade, idadeTotal = 0, minhaIdade;
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			System.out.print("Qual é a idade do seu " + (i + 1) + "º colega de trabalho? ");
			idade = sc.nextInt();
			idadeTotal += idade;

		}
		System.out.print("Qual é a sua idade? ");
		minhaIdade = sc.nextInt();

		idadeTotal += minhaIdade;

		System.out.println("Seu tempo de vida e dos seus colegas é de " + idadeTotal + " anos.");

		sc.close();
	}
}