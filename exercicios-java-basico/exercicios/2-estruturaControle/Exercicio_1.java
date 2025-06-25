package com.mycompany.estruturacontrole;

import java.util.Scanner;

public class Exercicio_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número para ver a sua tabuada: ");
        int num = scanner.nextInt();
        for (int i = 1; i <= 10; i++)
        {
            System.out.printf("%d X %d = %d\n", num, i, num * i);
        }
    }
}
