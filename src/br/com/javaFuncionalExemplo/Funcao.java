package br.com.javaFuncionalExemplo;

import java.util.function.Function;

public class Funcao {

	public static void main(String[] args) {
		
		// Aqui nesta classe mostra um exemplo de fun��o que retorna a String ao contr�ria.
		// Tamb�m temos uma fun��o para convers�o de String para Integer.
		Function<String, String> retornaNomeAoContrario = texto -> new StringBuilder(texto).reverse().toString();
		Function<String, Integer> converteStringParaInteiroECalculaODobro = string -> Integer.valueOf(string) * 2;
		
		System.out.println("Retornando nome ao contr�rio e convertendo String para inteiro e multiplicando: \n");
		System.out.println(retornaNomeAoContrario.apply("Alex Castro"));
		System.out.println(converteStringParaInteiroECalculaODobro.apply("21"));
	}
}