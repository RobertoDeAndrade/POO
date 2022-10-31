package br.com.residencia.poo.exerciciosdois;

import java.util.Scanner;

public class ExercicioListaQuatro {

	public static void main(String[] args) {
		double tempC, tempF;
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a temperatura em graus Celsius: ");
		tempC = sc.nextDouble();

		tempF = (tempC * 1.8) + 32;
		System.out.println("A temperatura equivalente em Fahrenheit é: " + tempF + "°");

		sc.close();
	}
}