package br.com.residencia.poo.exerciciosum;
import java.util.Scanner; //Importar a biblioteca para usar o teclado

public class Exercicio2 {

	public static void main(String[] args) {
		String nome;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Diga seu nome: ");
		nome = scan.nextLine();//Leitura de string
		
		System.out.println("Olá, " + nome + "!");

		scan.close();
	}
}