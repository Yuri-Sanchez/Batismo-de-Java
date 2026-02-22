package PrimeiroResumao;

public class Uchiha extends Ninja implements SharinganInterface{
    public Uchiha() {
    }

    public Uchiha(String nome, String aldeia, String cla, int idade) {
        super(nome, aldeia, cla, idade);
    }

    /*
    * Implemento da interface SharinganInterface
    * */
    @Override
    public void ativarSharingan(){
        System.out.println("Sou um Uchiha e tenho acesso ao Sharingan!");
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome: " + getNome());
        System.out.println("Aldeia: " + getAldeia());
        System.out.println("Clã: " + getCla());
        System.out.println("Idade: " + getIdade());
    }
}
