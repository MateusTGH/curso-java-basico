package br.com.stefanini.orientacaoaobjetos;

public class Tesla extends Carro2{

	private boolean dirigeSozinho;
	
	public Tesla() {
		super();//dados da classe pai
		//this//dados da classe atual mais a do pai
	}
	
	@Override
	public double calcularTaxaAceleracao(double velocidadeFinal, double tempoFinal) {
		System.out.println("Tesla sobrescrita");
		return velocidadeFinal * tempoFinal;
	}
	

	public boolean isDirigeSozinho() {
		return dirigeSozinho;
	}

	public void setDirigeSozinho(boolean dirigeSozinho) {
		this.dirigeSozinho = dirigeSozinho;
	}
	
	
	
}
