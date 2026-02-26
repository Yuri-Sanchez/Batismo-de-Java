package NivelIntermediario.Desafio03;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array
        Ninja[] ninjasCadastrados = new Ninja[4];

        // Variáveis
        int ninjasCadastradosCout = 0;
        int op = 0;

        while(op != 4){
            System.out.println("=======Menu Ninja=======");
            System.out.println("1 - Adicionar ninja");
            System.out.println("2 - Atualizar habilidade");
            System.out.println("3 - Listar Ninjas");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            op = sc.nextInt();

            switch (op){
                case 1:
                    if (ninjasCadastradosCout >= ninjasCadastrados.length){
                        System.out.println("Lista Cheia, impossível cadastrar um Ninja!\n");
                        break;
                    }

                    System.out.println("\n=======Escolha o clã=======");
                    System.out.println("1 - Uzumaki");
                    System.out.println("2 - Uchiha");
                    System.out.print("Sua escolha é: ");
                    int cla = sc.nextInt();
                    sc.nextLine();

                    switch (cla){
                        case 1:
                            Ninja novoNinja = new Ninja();
                            System.out.println("\n=======Informações da Ninja=======");

                            System.out.print("Nome: ");
                            novoNinja.nome = sc.nextLine();

                            System.out.print("Idade: ");
                            novoNinja.idade = sc.nextInt();
                            sc.nextLine();

                            System.out.print("Missão: ");
                            novoNinja.missao = sc.nextLine();

                            System.out.print("Dificuldade: ");
                            novoNinja.nivelDificuldade = sc.nextLine();

                            System.out.print("Status da missão: ");
                            novoNinja.statusMissao = sc.nextLine();

                            System.out.println("Ninja cadastrado com sucesso!\n");

                            ninjasCadastrados[ninjasCadastradosCout] = novoNinja;
                            ninjasCadastradosCout++;
                            break;

                        case 2:
                            Uchiha novoNinjaUchiha = new Uchiha();
                            System.out.println("\n=======Informações da Ninja=======");

                            System.out.print("Nome: ");
                            novoNinjaUchiha.nome = sc.nextLine();

                            System.out.print("Idade: ");
                            novoNinjaUchiha.idade = sc.nextInt();
                            sc.nextLine();

                            System.out.print("Missão: ");
                            novoNinjaUchiha.missao = sc.nextLine();

                            System.out.print("Dificuldade: ");
                            novoNinjaUchiha.nivelDificuldade = sc.nextLine();

                            System.out.print("Status da missão: ");
                            novoNinjaUchiha.statusMissao = sc.nextLine();

                            System.out.print("Habilidade Uchiha: ");
                            novoNinjaUchiha.habilidadeEspecial = sc.nextLine();

                            System.out.print("Ninja cadastrado com sucesso!\n\n");

                            ninjasCadastrados[ninjasCadastradosCout] = novoNinjaUchiha;
                            ninjasCadastradosCout++;
                            break;
                    }
                    break;

                case 2:
                    int[] indiceUchiha = new int[ninjasCadastradosCout];
                    int countUchiha = 0;

                    for (int i = 0; i < ninjasCadastradosCout; i++) {
                        if (ninjasCadastrados[i] instanceof Uchiha){
                            System.out.println("\nQual Uchiha deseja alterar: ");
                            System.out.print(countUchiha + " - " + ninjasCadastrados[i].nome);
                            indiceUchiha[countUchiha] = i;
                            countUchiha++;
                        }
                    }

                    if (countUchiha == 0){
                        System.out.println("Nenhum Uchiha cadastrado!");
                        break;
                    }

                    System.out.print("\nSua escolha: ");
                    int escolhaUchiha = sc.nextInt();
                    sc.nextLine();

                    if (escolhaUchiha < 0 || escolhaUchiha > countUchiha){
                        System.out.println("Opção inválida!");
                    }

                    int indiceReal = indiceUchiha[escolhaUchiha];
                    Uchiha uchihaSelecionado = (Uchiha) ninjasCadastrados[indiceReal];

                    System.out.println("\nDigite a nova habilidade: ");
                    String novaHabilidade = sc.nextLine();

                    uchihaSelecionado.atualizarHabilidade(novaHabilidade);

                    System.out.println("Habilidade atualizada com sucesso!\n");
                    uchihaSelecionado.mostrarInformacoes();
                    System.out.print("\n");
                    break;

                case 3:
                    if (ninjasCadastradosCout == 0){
                        System.out.println("Não há ninjas cadastrados!");

                    }else {
                        for (int i = 0; i < ninjasCadastradosCout; i++) {
                            if(ninjasCadastrados[i] != null){
                                ninjasCadastrados[i].mostrarInformacoes();
                                System.out.println("------------------------------------\n");
                            }
                        }
                    }
                    break;

                case 4:
                    System.out.println("Encerrando o programa, aguarde...");
                    break;

                default:
                    System.out.println("Opção inválida, tente novamente!");
                    break;
            }
        }
        sc.close();
    }
}