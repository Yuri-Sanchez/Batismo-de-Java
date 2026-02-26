package Condicoes;

public class Desafio01 {
    static void main() {
        //Ninja 1
        String nomeNinja = "Naruto Uzumaki";
        int idade = 14;
        String missao = "Encontrar o bandido";
        String statusDaMissao = "Em andamento";
        char rank = 'D';

        if (idade < 15){
            if (rank == 'C' || rank == 'D'){
                statusDaMissao = "Concluído";

            }else{
                statusDaMissao = "Não concluído";
            }
        }else{
            statusDaMissao = "Concluída";
        }

        System.out.println("Nome do ninja: " + nomeNinja);
        System.out.println("Idade do ninja: " + idade);
        System.out.println("Missão: " + missao);
        System.out.println("Status da missão: " + statusDaMissao);
        System.out.println("Nível da missão: " + rank);

        System.out.println("-------------------------------------------------------");

        //Ninja 2
        String nomeNinja2 = "Sasuke Uchiha";
        int idade2 = 19;
        String missao2 = "Reconhecimento da aldeia da chuva";
        String statusDaMissao2 = "Em andamento";
        char rank2 = 'S';

        if (idade2 < 15){
            if (rank2 == 'C' || rank2 == 'D'){
                statusDaMissao2 = "Concluído";

            }else{
                statusDaMissao2 = "Não concluído";
            }
        }else{
            statusDaMissao2 = "Concluída";
        }

        System.out.println("Nome do ninja: " + nomeNinja2);
        System.out.println("Idade do ninja: " + idade2);
        System.out.println("Missão: " + missao2);
        System.out.println("Status da missão: " + statusDaMissao2);
        System.out.println("Nível da missão: " + rank2);

        System.out.println("-------------------------------------------------------");

        //Ninja 3
        String nomeNinja3 = "Sakura Haruno";
        int idade3 = 17;
        String missao3 = "Ajudar no hospital";
        String statusDaMissao3 = "Em andamento";
        char rank3 = 'D';

        if (idade3 < 15){
            if (rank3 == 'C' || rank3 == 'D'){
                statusDaMissao3 = "Concluído";

            }else{
                statusDaMissao3 = "Não concluído";
            }
        }else{
            statusDaMissao3 = "Concluída";
        }

        System.out.println("Nome do ninja: " + nomeNinja3);
        System.out.println("Idade do ninja: " + idade3);
        System.out.println("Missão: " + missao3);
        System.out.println("Status da missão: " + statusDaMissao3);
        System.out.println("Nível da missão: " + rank3);
    }
}
