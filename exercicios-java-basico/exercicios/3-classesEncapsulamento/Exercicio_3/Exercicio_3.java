package Exercicio_3;

import java.util.Scanner;

public class Exercicio_3 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            MaquinaBanho pet = new MaquinaBanho();
            boolean exit = false;
            while (!exit)
            {
                System.out.println("""
                                   1 - Dar banho no pet
                                   2 - Abastecer com água
                                   3 - Abastecer com shampoo
                                   4 - Verificar nivel de água
                                   5 - Verificar nivel de shampoo
                                   6 - Verificar se tem pet no banho
                                   7 - Colocar pet na maquina
                                   8 - Retirar pet da máquina
                                   9 - Limpar maquina
                                   10 - Finalizar 
                                   Digite o que deseja fazer com seu pet: """);
                int opcao = scanner.nextInt();
                switch (opcao)
                {
                    case 1 -> pet.banho();
                    case 2 -> pet.abasteceAgua();
                    case 3 -> pet.abasteceShampoo();
                    case 4 -> pet.verificaAgua();
                    case 5 -> pet.verificaShampoo();
                    case 6 -> pet.verificaPetBanho();
                    case 7 -> pet.colocaPet();
                    case 8 -> pet.retiraPet();
                    case 9 -> pet.limpaMaquina();
                    case 10 -> exit = true;
                    default -> System.out.println("Opção inválida. Tente novamente!");
                }
            }
    }
}