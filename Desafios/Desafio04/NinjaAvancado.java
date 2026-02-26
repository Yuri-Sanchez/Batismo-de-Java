package NivelIntermediario.Desafio04;

public class NinjaAvancado implements Ninja{
    String nome;
    int idade;
    String habilidade;
    TipoHabilidade tipoHabilidade;

    public NinjaAvancado(){
        // Sempre trabalhamos com 2 construtores, um vazio e um com todas as informações
    }

    public NinjaAvancado(String nome, int idade, String habilidade, TipoHabilidade tipoHabilidade){
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
        this.tipoHabilidade = tipoHabilidade;
    }

    public void mostrarInformacoes(){
        System.out.println("\n=======Informações do ninja básico=======");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Habilidade: " + habilidade);
        System.out.println("Especialidade: " + tipoHabilidade);
    }

    public void executarHabilidade(){
        System.out.println(nome + " está usando: " + habilidade + " (" + tipoHabilidade + ")");
    }
}
