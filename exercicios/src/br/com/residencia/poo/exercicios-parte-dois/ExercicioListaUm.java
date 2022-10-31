package br.com.residencia.poo.exerciciosdois;

import java.util.Scanner;

public class ExercicioListaUm {

	public static void main(String[] args) {
		String nome, sobrenome;
		Scanner sc = new Scanner(System.in);

		System.out.print("Qual o seu nome? ");
		nome = sc.nextLine();

		System.out.print("E qual seu sobrenome? ");
		sobrenome = sc.nextLine();

		System.out.println("Bem-vindo, " + nome + " " + sobrenome + "!");

		sc.close();
	}
}