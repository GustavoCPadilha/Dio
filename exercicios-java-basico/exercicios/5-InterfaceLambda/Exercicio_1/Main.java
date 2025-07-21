package Exercicio_1;

import java.util.Scanner;


public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int option;
        MessageService service = null;

        while (true) {
            System.out.println("\nEscolha o serviço para enviar a mensagem:");
            System.out.println("1 - SMS");
            System.out.println("2 - E-mail");
            System.out.println("3 - Redes Sociais");
            System.out.println("4 - WhatsApp");
            System.out.println("5 - Sair");

            option = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            if (option == 5) break;

            System.out.print("Digite a mensagem: ");
            String message = scanner.nextLine();

            switch (option) {
                case 1 -> service = msg -> System.out.println("Enviando SMS: " + msg);
                case 2 -> service = msg -> System.out.println("Enviando E-mail: " + msg);
                case 3 -> service = msg -> System.out.println("Postando nas Redes Sociais: " + msg);
                case 4 -> service = msg -> System.out.println("Enviando mensagem pelo WhatsApp: " + msg);
                default -> {
                    System.out.println("Opção inválida!");
                    continue;
                }
            }

            service.sendMessage(message);
        }

        System.out.println("Programa encerrado.");
    }
}
