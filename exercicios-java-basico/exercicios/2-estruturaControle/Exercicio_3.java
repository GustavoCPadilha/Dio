package com.mycompany.estruturacontrole;

import java.util.Scanner;

public class Exercicio_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int num_1 = scanner.nextInt();
        System.out.println("Digite um segundo número, maior que o primeiro: ");
        int num_2 = scanner.nextInt();
        
        while (num_2 <= num_1)
        {
            System.out.println("Erro, digite um número maior que o primeiro! ");
            num_2 = scanner.nextInt();
        }
        
        System.out.println("Escolha entre par e ímpar para visualizar os números: ");
        String par_ou_impar = scanner.next();
        while (!par_ou_impar.equalsIgnoreCase("par") && !par_ou_impar.equalsIgnoreCase("impar"))
        {
            System.out.println("Operação Inválida! Escolha entre par ou ímpar: ");
            par_ou_impar = scanner.next();
        }
        
        boolean par = false;
        boolean impar = false;
        if (par_ou_impar.equalsIgnoreCase("par")) par = true;
        else impar = true;

        for (int i = num_1; i <= num_2; i++)
        {
            if (par)
            {
                if (i % 2 == 0)
                {
                    System.out.printf("%d ", i);
                } 
            }
            else if (impar)
            {
                if (!(i % 2 == 0))
                {
                    System.out.printf("%d ", i);
                }
            }
        }
    }
}
