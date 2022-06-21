package br.com.javaFuncionalExemplo;

public class FuncaoAltaOrdem {
    public static void main(String[] args) {
    	
    	// Lambda para os tipos de c�lculo com Java Funcional e puxando o m�todo corretamente para cada tipo de opera��o.
        Calculo SOMA = (a, b) -> a+b;
        Calculo SUBTRACAO = (a, b) -> a-b;
        Calculo MULTIPLICACAO = (a, b) -> a*b;
        Calculo DIVISAO = (a, b) -> a/b;

        System.out.println("Trabalhando com Java Funcional e Lambda \n");
        System.out.println("O resultado da soma �: " + executarOperacao(SOMA, 1, 3)); //4
        System.out.println("O resultado da subtra��o �: " + executarOperacao(SUBTRACAO, 4, 3)); //1
        System.out.println("O resultado da multiplica��o �: " + executarOperacao(MULTIPLICACAO, 7, 3)); //21
        System.out.println("O resultado da divis�o �: " + executarOperacao(DIVISAO, 4, 2)); //2
    }

    public static int executarOperacao(Calculo calculo, int a, int b) {
        return calculo.calcular(a, b);
    }
}

@FunctionalInterface
interface Calculo {
    public int calcular(int a, int b);
}