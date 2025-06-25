package com.mycompany.estruturacontrole;

import java.util.Scanner;

public class Exercicio_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua altura: ");
        float altura = scanner.nextFloat();
        System.out.println("Digite seu peso: ");
        float peso = scanner.nextFloat();
        float imc = peso/(altura * altura);
        System.out.printf("Seu IMC é %.2f\n", imc);
        
        if (imc <= 18.5) System.out.println("Abaixo do peso");
        else if (imc <= 24.9) System.out.println("Peso ideal");
        else if (imc <= 29.9) System.out.println("Levemente acima do peso");
        else if (imc <= 34.9) System.out.println("Obesidade Grau I");
        else if (imc <= 39.9) System.out.println("Obesidade Grau II (Severa)");
        else System.out.println("Obesidade III (Mórbida)");
    }
}
