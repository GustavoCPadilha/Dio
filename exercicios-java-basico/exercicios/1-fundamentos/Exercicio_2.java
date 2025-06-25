package gustavo.fundamentos;

import java.util.Scanner;

public class Exercicio_2 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o tamanho do lado do quadrado: ");
        float lado = scanner.nextFloat();
        float area = lado * lado;
        System.out.printf("A área desse quadrado é de %.2f m²\n", area);
    }
}
