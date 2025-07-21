package Exercicio_2;


import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int option;
        TaxCalculator calculator = null;

        while (true) {
            System.out.println("\nEscolha o tipo de produto:");
            System.out.println("1 - Alimentação");
            System.out.println("2 - Saúde e Bem-estar");
            System.out.println("3 - Vestuário");
            System.out.println("4 - Cultura");
            System.out.println("5 - Sair");

            option = scanner.nextInt();
            if (option == 5) break;

            System.out.print("Informe o valor do produto: R$ ");
            double price = scanner.nextDouble();

            switch (option) {
                case 1 -> calculator = p -> p * 0.01;
                case 2 -> calculator = p -> p * 0.015;
                case 3 -> calculator = p -> p * 0.025;
                case 4 -> calculator = p -> p * 0.04;
                default -> {
                    System.out.println("Opção inválida!");
                    continue;
                }
            }

            double tax = calculator.calculateTax(price);
            System.out.printf("O tributo do produto é: R$ %.2f%n", tax);
        }

        System.out.println("Programa encerrado.");
    }
}
