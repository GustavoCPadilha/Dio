package gustavo.fundamentos;

import java.util.Scanner;

public class Exercicio_3 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a base do retângulo: ");
        float base = scanner.nextFloat();
        System.out.println("Digite a altura do retângulo: ");
        float altura = scanner.nextFloat();
        float area = base * altura;
        System.out.printf("A área desse retângulo é de %.2f m²\n", area);
    }
}
