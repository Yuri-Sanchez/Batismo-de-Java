package Desafios.Desafio02;

import java.util.Scanner;

public class Desafio02 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int NUMERO_MAX = 3;
        String[] ninjas = new String[NUMERO_MAX];

        int ninjasCadastrados = 0;
        int opcao = 0;


        while (opcao != 4) {
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Deletar Ninja");
            System.out.println("3. Listar Ninjas");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // A linha que está sendo ignorada após o uso do nextInt() ocorre porque o nextInt() não consome a quebra de linha (\n) deixada no buffer. Para resolver isso, adicione um scanner.nextLine(); logo após o nextInt() para consumir essa quebra de linha.

            switch (opcao){
                case 1:
                    if (ninjasCadastrados < NUMERO_MAX){
                        System.out.println("Digite o nome do ninja para cadastro: ");
                        String nomeNinja = scanner.nextLine();
                        ninjas[ninjasCadastrados] = nomeNinja;
                        ninjasCadastrados ++;
                        System.out.println("Ninja cadastrado com sucesso");

                    }else{
                        System.out.println("A lista de ninjas esta cheia, impossível cadastrar");
                    }
                    break;

                case 2:
                    if(ninjasCadastrados == 0){
                        System.out.println("Nenhum ninja para remover");

                    }else{
                        System.out.println("Escolha o ninja para remover: ");

                        // Lista dos ninjas cadastrados
                        for (int i = 0; i < ninjasCadastrados; i++) {
                            System.out.println(i + " - " + ninjas[i]);
                        }

                        System.out.println("Digite o número do ninja: ");
                        int indice = scanner.nextInt();
                        scanner.nextLine();

                        // Deslocar elementos para esquerda
                        if(indice >= 0 && indice < ninjasCadastrados){
                            for (int i = indice; i < ninjasCadastrados - 1; i++) {
                                ninjas[i] = ninjas[i+1];
                            }

                            ninjas[ninjasCadastrados - 1] =  null;

                            ninjasCadastrados--;

                            System.out.println("Ninja removido com sucesso!");

                        }else{
                            System.out.println("Índice inválido.");
                        }
                    }
                    break;
                case 3:
                    if(ninjasCadastrados == 0) {
                        System.out.println("Nenhum ninja cadastrado!");

                    }else{
                        System.out.println("========Lista de ninjas=======");
                        for (int i = 0; i < ninjas.length; i++) {
                            System.out.println((i + 1) + "° " + ninjas[i]);
                        }
                    }
                    break;

                case 4:
                    System.out.println("Aguarde...Encerrando o programa");
                    break;

                default:
                    System.out.println("Digite uma opção válida!");
                    break;
            }
        }
        scanner.close();
    }
}