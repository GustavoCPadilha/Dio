package Exercicio_1;

public class ContaBancaria {
    private double saldo;
    private double chequeEspecial;
    private final double limiteChequeEspecial;
    
    public ContaBancaria(double depositoInicial) {
        this.saldo = depositoInicial;

        if (depositoInicial <= 500) {
            this.limiteChequeEspecial = 50;
        } else {
            this.limiteChequeEspecial = depositoInicial * 0.5;
        }
        
        this.chequeEspecial = this.limiteChequeEspecial;
    }
    
    public double consultarSaldo() {
        return saldo;
    }
    
    public double consultarChequeEspecial() {
        return chequeEspecial;
    }
    
    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido para depósito.");
            return;
        }
        
        // Primeiro, se o cheque especial foi usado, o valor é usado para quitar ele
        double valorUsadoCheque = limiteChequeEspecial - chequeEspecial;
        
        if (valorUsadoCheque > 0) {
            double taxa = valorUsadoCheque * 0.20;
            double totalParaCobrir = valorUsadoCheque + taxa;

            if (valor >= totalParaCobrir) {
                chequeEspecial = limiteChequeEspecial;
                saldo += (valor - totalParaCobrir);
                System.out.println("Cheque especial quitado com taxa de 20%.");
            } else {
                chequeEspecial += valor / 1.2; // Parte do valor cobre o cheque, proporcionalmente considerando a taxa
                System.out.println("Parte do cheque especial foi quitada.");
            }
        } else {
            saldo += valor;
        }
        
        System.out.println("Depósito realizado com sucesso.");
    }
    
    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido para saque.");
            return;
        }
        
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso.");
        } else if (valor <= saldo + chequeEspecial) {
            double restante = valor - saldo;
            saldo = 0;
            chequeEspecial -= restante;
            System.out.println("Saque realizado utilizando o cheque especial.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
    
    public void pagarBoleto(double valor) {
        System.out.println("Pagando boleto de R$" + valor);
        sacar(valor);
    }
    
    public boolean usandoChequeEspecial() {
        return chequeEspecial < limiteChequeEspecial;
    }
}
