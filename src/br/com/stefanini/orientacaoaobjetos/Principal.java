package br.com.stefanini.orientacaoaobjetos;

public class Principal {

	public static void main(String[] args) {
		Carro2 bmw = new Carro2();
		bmw.setMarca("BMW");
		bmw.setModelo("M3");
		bmw.setQuilometrosPorLitros(7.5);
		//bmw.taxaAceleracao = 50;
		bmw.setVelocidadeMaxima(280);
		
		Carro2 mercedes = new Carro2("Mercedes", "c180");
		System.out.println(mercedes.getMarca());
		System.out.println(mercedes.getModelo());
		
		BMW bmwDois = new BMW();
		Tesla tesla = new Tesla();
		tesla.isDirigeSozinho();
		
		Carro2 teslaDois = new Tesla();
		((Tesla) teslaDois).setDirigeSozinho(true);
		System.out.println(((Tesla) teslaDois).isDirigeSozinho());
		
		
		
		
		
		Carro2[] carros = new Carro2[] {bmw, bmwDois, tesla, teslaDois};
		
		for (Carro2 carro2 : carros) {
			if (carro2 instanceof Tesla) {
				System.out.println(((Tesla)carro2).isDirigeSozinho());
			}
		}
		
		
		bmwDois.calcularTaxaAceleracao(100.50, 10);
		tesla.calcularTaxaAceleracao(100.50, 10);
		
//		System.out.println(bmwDois.calcularTaxaAceleracao(100.5, 10.5));
//		
//		System.out.println(bmw.getMarca());
//		System.out.println(bmw.getModelo());
//		System.out.println(bmw.getQuilometrosPorLitros());
//		System.out.println(bmw.getTaxaAceleracao());
//		System.out.println(bmw.getVelocidadeMaxima());
//		
//		bmw.acelerar();
//		bmw.frear();
//		
//		System.out.println(bmw.calcularTaxaAceleracao(bmw.getVelocidadeMaxima(), 0, 10, 0));
//		System.out.println(bmw.calcularTaxaAceleracao(bmw.getVelocidadeMaxima(), 5));
//		System.out.println(bmw.calcularTaxaAceleracao(100, 5));
	}
}
