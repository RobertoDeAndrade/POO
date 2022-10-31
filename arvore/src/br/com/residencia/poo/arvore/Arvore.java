package br.com.residencia.poo.arvore;

public class Arvore {

	public static void main(String[] args) {
		int n = 10;
		
		System.out.println("  Desafio da árvore!\n\n");

		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				System.out.print(" ");
			}
			
			System.out.print("*");
			for (int j = 0; j < i; j++) {
				System.out.print("**");
			}
			System.out.print("\n");
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < n - 1; j++) {
				System.out.print(" ");
			}
			System.out.print("***\n");
		}
		System.out.print("       |_***_|\n");
		System.out.print("mmmmmmmmmmmmmmmmmmmmmmm\n");
		System.out.print("  Obrigado pela aula!\n");
		System.out.print("mmmmmmmmmmmmmmmmmmmmmmm\n");
	}
}