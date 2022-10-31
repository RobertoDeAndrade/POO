package br.com.residencia.poo.balanco;

public class Principal {
	
	public static void main(String[] args) {
	
		Balanco balanco = new Balanco();
		balanco.somar(); //metodo com os valores dos atributos definidos na classe Balanco
		balanco.somar(20000.0, 20000.0, 20000.0); //sobrecarga
		balanco.somar(20000.0, 20000.0, 20000.0, 20000.0, 20000.0, 20000.0); //sobrecarga
		balanco.somar(20000.0, 20000.0, 20000.0, 20000.0, 20000.0, 20000.0,  
				20000.0, 20000.0, 20000.0, 20000.0, 20000.0, 20000.0); //sobrecarga		
	}
}