package NivelIntermediario.Desafio05;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        int op = 0;
        int valor = 0;
        Scanner sc = new Scanner(System.in);

        ContaCorrente narutoCorrente = new ContaCorrente();
        ContaPoupanca narutoPoupanca = new ContaPoupanca();

        while(op != 3) {
            System.out.println("\n---------- Banco Konoha ---------");
            System.out.println("1 - Saldo");
            System.out.println("2 - Depósito");
            System.out.println("3 - Sair");
            System.out.print("Opção: ");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("\nEscolha a conta:");
                    System.out.println("1 - Conta Corrente");
                    System.out.println("2 - Conta Poupança");
                    System.out.print("Opção: ");
                    op = sc.nextInt();
                    sc.nextLine();
                    switch (op) {
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
                    op = sc.nextInt();

                    switch (op) {
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