package main;

import calc.Calculadora;

public class App {
	
	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		double resultado = 0;
		
		resultado = calculadora.soma(10, 5);
		System.out.println(resultado);
		
		resultado = calculadora.sub(2, 3.4);
		System.out.println(resultado);
		
		resultado = calculadora.mult(2, 5);
		System.out.println(resultado);
		
		resultado = calculadora.div(2, 0);
		System.out.println(resultado);
	}
}
