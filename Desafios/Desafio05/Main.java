package Desafios.Desafio05;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        int opPrincipal = 0;
        int opConta = 0;
        int opDeposito = 0;
        int valor = 0;
        Scanner sc = new Scanner(System.in);

        ContaCorrente narutoCorrente = new ContaCorrente();
        ContaPoupanca narutoPoupanca = new ContaPoupanca();

        while(opPrincipal != 3) {
            System.out.println("\n---------- Banco Konoha ---------");
            System.out.println("1 - Saldo");
            System.out.println("2 - Depósito");
            System.out.println("3 - Sair");
            System.out.print("Opção: ");
            opPrincipal = sc.nextInt();

            switch (opPrincipal) {
                case 1:
                    System.out.println("\nEscolha a conta:");
                    System.out.println("1 - Conta Corrente");
                    System.out.println("2 - Conta Poupança");
                    System.out.print("Opção: ");
                    opConta = sc.nextInt();
                    switch (opConta) {
                        case 1:
                            narutoCorrente.consultarSaldo();
                            break;

                        case 2:
                            narutoPoupanca.consultarSaldo();
                            break;
                    }
                    break;

                case 2:
                    System.out.println("\nEscolha a conta:");
                    System.out.println("1 - Conta Corrente");
                    System.out.println("2 - Conta Poupança");
                    System.out.print("Opção: ");
                    opDeposito = sc.nextInt();

                    switch (opDeposito) {
                        case 1:
                            System.out.print("Valor a depositar: ");
                            valor = sc.nextInt();
                            narutoCorrente.depositar(valor);
                            break;

                        case 2:
                            System.out.print("Valor a depositar: ");
                            valor = sc.nextInt();
                            narutoPoupanca.depositar(valor);
                            break;

                        default:
                            System.out.println("Opção de conta inválida");
                    }
                    break;

                case 3:
                    System.out.println("Obrigado, volte sempre!");
                    break;

                default:
                    System.out.println("Opção inválida, tente novamente!");
                    break;
            }
        }

        sc.close();
    }
}