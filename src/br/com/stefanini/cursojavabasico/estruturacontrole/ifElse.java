package br.com.stefanini.cursojavabasico.estruturacontrole;

public class ifElse {

	public static void main(String[] args) {
		int idade = 18;
		
		if (idade >= 18) {
			System.out.println("Maior de Idade");
		}
		
		if (idade >= 18) {
			System.out.println("Maior de Idade");
		} else {
			System.out.println("Menor de Idade");
		}
		
		if (idade >= 100) {
			System.out.println("Virou uma mumia");
		} else if(idade >= 18){
			System.out.println("Menor de Idade");
		} else {
			System.out.println("Menor de Idade");
		}
		
		if(idade >=18) System.out.println("Meior de Idade"); //só executa a primeira linha
		
	}
}
