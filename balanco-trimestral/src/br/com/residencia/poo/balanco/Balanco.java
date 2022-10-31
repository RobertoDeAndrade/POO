package br.com.residencia.poo.balanco;

public class Balanco {

		double gastosJaneiro = 15000;
		double gastosFevereiro = 23000;
		double gastosMarco = 17000;
		double gastosAbril = 15000;
		double gastosMaio = 15000;
		double gastosJunho = 15000;
		double gastosJulho = 20000;
		double gastosAgosto = 20000;
		double gastosSetembro = 20000;
		double gastosOutubro = 20000;
		double gastosNovembro = 10000;
		double gastosDezembro = 10000;
		double somaT = gastosJaneiro + gastosFevereiro + gastosMarco;
		double somaS = gastosJaneiro + gastosFevereiro + gastosMarco + gastosAbril + gastosMaio + gastosJunho;
		double somaA = gastosJaneiro + gastosFevereiro + gastosMarco + gastosAbril + gastosMaio + gastosJunho
				+ gastosJulho + gastosAgosto + gastosSetembro + gastosOutubro + gastosNovembro + gastosDezembro;
		
		public void somar(){
			System.out.printf("O balanço trimestral é de R$ %.2f\n", somaT);
			System.out.printf("O balanço semestral é de R$ %.2f\n", somaS);
			System.out.printf("O balanço anual é de R$ %.2f\n", somaA);
		}

		public void somar(double gastosJaneiro, double gastosFevereiro, double gastosMarco) {
			double somaTotal = gastosJaneiro + gastosFevereiro + gastosMarco;
			System.out.printf("\nO balanço trimestral é de R$ %.2f", somaTotal);		
		}
		
		public void somar(double gastosJaneiro, double gastosFevereiro, double gastosMarco, double gastosAbril, double gastosMaio, double gastosJunho) {
			double somaTotal = gastosJaneiro + gastosFevereiro + gastosMarco + gastosAbril + gastosMaio + gastosJunho;
			System.out.printf("\nO balanço semestral é de R$ %.2f", somaTotal);		
		}
		
		public void somar(double gastosJaneiro, double gastosFevereiro, double gastosMarco, double gastosAbril, double gastosMaio, double gastosJunho,
				double gastosJulho, double gastosAgosto, double gastosSetembro, double gastosOutubro, double gastosNovembro, double gastosDezembro) {
			double somaTotal = gastosJaneiro + gastosFevereiro + gastosMarco + gastosAbril + gastosMaio + gastosJunho 
					+ gastosJulho + gastosAgosto + gastosSetembro + gastosOutubro + gastosNovembro + gastosDezembro;
			System.out.printf("\nO balanço anual é de R$ %.2f", somaTotal);		
		}
}