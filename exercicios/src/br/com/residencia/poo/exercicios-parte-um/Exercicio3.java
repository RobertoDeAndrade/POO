package br.com.residencia.poo.exerciciosum;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		String nome;
		int idade;
		Scanner console = new Scanner(System.in);
		
		System.out.print("Qual seu nome? ");
		nome = console.nextLine();
		
		System.out.print("Qual é a sua idade? ");
		idade = console.nextInt();//Leitura de inteiro
		
		System.out.println("Seu nome é " + nome + " e você tem " + idade + " anos.");
		
		console.close();
	}
}