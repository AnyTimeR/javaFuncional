package br.com.javaFuncionalExemplo;

public class FuncaoAltaOrdem {
    public static void main(String[] args) {
    	
    	// Lambda para os tipos de cálculo com Java Funcional e puxando o método corretamente para cada tipo de operação.
        Calculo SOMA = (a, b) -> a+b;
        Calculo SUBTRACAO = (a, b) -> a-b;
        Calculo MULTIPLICACAO = (a, b) -> a*b;
        Calculo DIVISAO = (a, b) -> a/b;

        System.out.println("Trabalhando com Java Funcional e Lambda \n");
        System.out.println("O resultado da soma é: " + executarOperacao(SOMA, 1, 3)); //4
        System.out.println("O resultado da subtração é: " + executarOperacao(SUBTRACAO, 4, 3)); //1
        System.out.println("O resultado da multiplicação é: " + executarOperacao(MULTIPLICACAO, 7, 3)); //21
        System.out.println("O resultado da divisão é: " + executarOperacao(DIVISAO, 4, 2)); //2
    }

    public static int executarOperacao(Calculo calculo, int a, int b) {
        return calculo.calcular(a, b);
    }
}

@FunctionalInterface
interface Calculo {
    public int calcular(int a, int b);
}