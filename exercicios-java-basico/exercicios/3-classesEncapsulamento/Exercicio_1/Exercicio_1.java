package Exercicio_1;

import java.util.Scanner;

public class Exercicio_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bem-vindo ao Banco!");
        System.out.print("Informe o valor de depósito inicial: R$ ");
        double depositoInicial = scanner.nextDouble();
        
        ContaBancaria conta = new ContaBancaria(depositoInicial);
        
        boolean exit = false;
        
        while (!exit) {
            System.out.println("""
                   -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                   1 - Consultar saldo
                   2 - Consultar cheque especial disponível
                   3 - Depositar dinheiro
                   4 - Sacar dinheiro
                   5 - Pagar boleto
                   6 - Verificar se está usando cheque especial
                   7 - Finalizar execução
                   O que deseja fazer?
                   -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=""");
            
            int opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1 -> System.out.printf("Saldo atual: R$ %.2f%n", conta.consultarSaldo());
                case 2 -> System.out.printf("Cheque especial disponível: R$ %.2f%n", conta.consultarChequeEspecial());
                case 3 -> {
                    System.out.print("Digite o valor para depósito: R$ ");
                    double valorDeposito = scanner.nextDouble();
                    conta.depositar(valorDeposito);
                }
                case 4 -> {
                    System.out.print("Digite o valor para saque: R$ ");
                    double valorSaque = scanner.nextDouble();
                    conta.sacar(valorSaque);
                }
                case 5 -> {
                    System.out.print("Digite o valor do boleto: R$ ");
                    double valorBoleto = scanner.nextDouble();
                    conta.pagarBoleto(valorBoleto);
                }
                case 6 -> {
                    if (conta.usandoChequeEspecial()) {
                        System.out.println("Você está usando o cheque especial!");
                    } else {
                        System.out.println("Você NÃO está usando o cheque especial.");
                    }
                }
                case 7 -> {
                    System.out.println("Finalizando execução... Volte sempre!");
                    exit = true;
                }
                default -> System.out.println("Opção inválida. Tente novamente!");
            }
        }
    }
}
