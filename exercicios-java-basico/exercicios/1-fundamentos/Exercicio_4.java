package gustavo.fundamentos;

import java.util.Scanner;

public class Exercicio_4 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome da primeira pessoa: ");
        String nome_1 = scanner.next();
        System.out.println("Digite a idade da primeira pessoa: ");
        int idade_1 = scanner.nextInt();
        System.out.println("Digite o nome da segunda pessoa: ");
        String nome_2 = scanner.next();
        System.out.println("Digite a idade da segunda pessoa: ");
        int idade_2 = scanner.nextInt();
        System.out.printf("%s tem %d anos e %s tem %d anos\n", nome_1, idade_1, nome_2, idade_2);
        System.out.printf("A diferença de idade é de %d anos\n", Math.abs(idade_1 - idade_2));
    }
}
