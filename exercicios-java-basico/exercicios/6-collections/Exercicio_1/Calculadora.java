package Exercicio_1;

public class Calculadora {

    public void soma(int... numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }

    public void subtracao(int... numeros) {
        int subtracao = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            subtracao -= i;
        }
        System.out.println(subtracao);
    }
}
