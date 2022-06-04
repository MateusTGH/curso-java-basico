package br.com.stefanini.operadores;

public class OperadoresLogicos {

	public static void main(String[] args) {
		/**
		 * 
		 * AND
		 * V and F => F
		 * V and V => V
		 * F and V => F
		 * F and F => F
		 * 
		 * OR
		 * V or F => V
		 * V or V => V
		 * F or V => V
		 * f or F => F
		 * 
		 * XOR
		 * V xor F => V
		 * V xor V => F
		 * F xor V => V
		 * F xor F => F
		 * 
		 * Nega��o L�gica
		 * !V => F
		 * !F => V
		 */
		
		boolean v = true;
		boolean f = false;
		
		//and &&
		System.out.println(v && f);
		
		//or ||
		System.out.println(v || f);
		
		// xor != operaor diferente
		System.out.println(v != f);
		
		//! nega��o
		System.out.println(!v);
		System.out.println(!f);
	}

}
