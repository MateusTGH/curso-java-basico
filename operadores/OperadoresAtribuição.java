package br.com.stefanini.operadores;

public class OperadoresAtribui��o {
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		
		b += a; //aditivo
		b-= a; //subtrativo
		b *= a;
		b /= a;
		b%= a ; //modular, pega o resto da divis�o
		
		System.out.println(a % b); // 0
		
		
	}
	
}
