package Exercicio_2;

import java.util.Scanner;

public class Exercicio_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Carro carro = new Carro();
        boolean exit = false;
        while (!exit)
        {
            System.out.println("""
                   -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                   1 - Ligar o carro
                   2 - Desligar o carro
                   3 - Acelerar
                   4 - Freiar
                   5 - Virar para a direita/esquerda
                   6 - Verificar a velocidade
                   7 - Aumentar a marcha
                   8 - Diminuir a marcha
                   9 - Finalizar execução
                   O que deseja fazer?
                   -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=""");
            int opcao = scanner.nextInt();
            switch (opcao)
            {
                case 1 -> carro.ligar();
                case 2 -> carro.desligar();
                case 3 -> carro.acelerar();
                case 4 -> carro.freiar();
                case 5 -> carro.virar();
                case 6 -> carro.status();
                case 7 -> carro.aumentaMarcha();
                case 8 -> carro.diminuiMarcha();
                case 9 -> 
                {
                    System.out.println("Finalizando execução... Volte sempre!");
                    exit = true;
                }
                default -> System.out.println("Opção inválida. Tente novamente!");
            }  
        }
    }
}
