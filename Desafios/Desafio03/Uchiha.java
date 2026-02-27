package Desafios.Desafio03;

public class Uchiha extends Ninja{
    String habilidadeEspecial;

    public void mostrarHabilidadeEspecial(){
        System.out.println("Habilidade: " + habilidadeEspecial);
    }

    public void mostrarInformacoes(){
        super.mostrarInformacoes();
        System.out.println("Habilidade: " + habilidadeEspecial);
    }

    public void atualizarHabilidade(String novaHabilidade){
        this.habilidadeEspecial = novaHabilidade;
    }
}
