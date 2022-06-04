package br.com.stefanini.orientacaoaobjetos;

public class Carro2 {

	/*
	 * modificadores de acesso
	 * default > não tem uma palavra chave. Acessível própria classe ou classe de um mesmo pacote.
	 * public > permite acesso em qualquer lugar, própria classe, do mesmo pacote, subclasses(extends), etc..
	 *private >  acessivel apenas na própria classe
	 *procted > permite acesso em qualquer lugar, própria classe, do mesmo pacote, subclasses(extends), etc..
	 */
	
	private String marca;
	private String modelo;
	private int velocidadeMaxima;
	private int taxaAceleracao;
	private double quilometrosPorLitros;
	
	public Carro2() {
		System.out.println("Construindo um carro2.");
	}
	
	public Carro2(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}
	
	public void acelerar() {
		System.out.println("Acelerando ...");
	}
	
	public void frear() {
		System.out.println("Freando ...");
	}
	
	public double calcularTaxaAceleracao(double velocidadeFinal, double velocidadeInicial, double tempoFinal, double tempoInicial) {
		return (velocidadeFinal - velocidadeInicial) / (tempoFinal - tempoInicial) * 3.6;
	}
	
	public double calcularTaxaAceleracao(double velocidadeFinal, double tempoFinal) {
		return (velocidadeFinal - 0) / (tempoFinal - 0) * 3.6;
	}
	
	public String calcularTaxaAceleracao(int velocidadeFinal, int tempoFinal) {
		return ""+(velocidadeFinal - 0) / (tempoFinal - 0) * 3.6;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(int velocidadeMaxima) {
		if(velocidadeMaxima < 0) {
			System.out.println("Valor é inválido");
		} else {
		this.velocidadeMaxima = velocidadeMaxima;
	}
	}	

	public int getTaxaAceleracao() {
		return taxaAceleracao;
	}

	public void setTaxaAceleracao(int taxaAceleracao) {
		this.taxaAceleracao = taxaAceleracao;
	}

	public double getQuilometrosPorLitros() {
		return quilometrosPorLitros;
	}

	public void setQuilometrosPorLitros(double quilometrosPorLitros) {
		this.quilometrosPorLitros = quilometrosPorLitros;
	}
	
	
	
}
