package Exercicio_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        System.out.println("Digite os números para somar (separados por vírgula):");
        String entradaSoma = scanner.nextLine();
        int[] numerosSoma = converterParaArray(entradaSoma);
        calculadora.soma(numerosSoma);

        System.out.println("Digite os números para subtrair (separados por vírgula):");
        String entradaSubtracao = scanner.nextLine();
        int[] numerosSub = converterParaArray(entradaSubtracao);
        calculadora.subtracao(numerosSub);
    }

    public static int[] converterParaArray(String entrada) {
        String[] partes = entrada.split(",");
        int[] numeros = new int[partes.length];
        for (int i = 0; i < partes.length; i++) {
            numeros[i] = Integer.parseInt(partes[i].trim());
        }
        return numeros;
    }
}
