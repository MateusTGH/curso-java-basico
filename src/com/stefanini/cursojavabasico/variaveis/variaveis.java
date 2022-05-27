package com.stefanini.cursojavabasico.variaveis;

public class variaveis {
	public static void main(String[] args) {
		byte numByte = 127; //-128 a 127 (8 bits)
		short numShort = 12321; //-32768 a 32767 (16 bit)
		int numInt = 2147483647; //(32 bits)
		long numLong = 897997888; //(64 bits) quando estrapolhar, de um int dentro do long, precisa usar uma letra literal "L"
		
		float numFloat = 10.000f; //(32bits) tem que usar um literal
		double numDouble = 1000000000000.000; //(64 bits)
		
		char varChar = 'F'; //(16bits) apenas aspas simples
		
		boolean varBoolean = true; // true ou false
		
		String texto = "Bem vindos Devs!";
		Integer numeroConta = 4000;
		Long numeroLongo = 1213123L;
		
		//Ele deve começar com uma letra minuscula. Exemplo: nome
		//Não deve começar com caracteres especiais como & (e comercial),$(dólar), _(sublinhado). Exemplo _nome
		//Se o nome for composto de uma palavra, inicia-se a primeira palavra com a letra minuscula seguida por uma letra maiscula.
		//Evite usar variaveis de um caractere.
		
		String nomeCompleto = "Mateus";
		
	}
}
