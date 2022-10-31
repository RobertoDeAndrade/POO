package br.com.residencia.poo.exerciciosum;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		double nota, media, totalNotas = 0.0;
		//double nota1, nota2, nota3;
		String disciplina, nome;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		nome = scan.nextLine();
		System.out.print("Digite sua disciplina: ");
		disciplina = scan.nextLine();
		
//	    System.out.print("Digite sua primeira nota: ");
//		nota1 = scan.nextDouble();
//		System.out.print("Digite sua segunda nota: ");
//		nota2 = scan.nextDouble();
//		System.out.print("Digite sua terceira nota: ");
//		nota3 = scan.nextDouble();
//		
//		media = (nota1 + nota2 + nota3) / 3;
//		System.out.println("Olá, " + nome + "!");
//		System.out.println("Na disciplina " + disciplina + " sua média é " + media);
//		
//		
//		for(int i = 1; i <= 3; i++) {
//			System.out.print("Digite sua " + i + "ª nota: ");
//			nota = scan.nextDouble();
//			totalNotas += nota;
//		}
//		media = totalNotas / 3;
//		System.out.println("Olá, " + nome + "!");
//		System.out.println("Na disciplina " + disciplina + " sua média é " + media);
		
		int cont = 1;
		do{
			System.out.print("Digite sua " + cont + "ª nota: ");
			nota = scan.nextDouble();
			totalNotas += nota;
			cont++;
		}while(cont <= 3);
		
		media = totalNotas / 3;
		System.out.println("Olá, " + nome + "!");
		System.out.println("Na disciplina " + disciplina + " sua média é " + media);
		
		scan.close();
	}
}