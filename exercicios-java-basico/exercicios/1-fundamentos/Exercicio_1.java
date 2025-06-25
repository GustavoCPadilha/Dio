package gustavo.fundamentos;

import java.util.Scanner;

public class Exercicio_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = scanner.next();
        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();
        System.out.printf("Olá, %s, você tem %d anos\n", nome, idade);
    }
}
