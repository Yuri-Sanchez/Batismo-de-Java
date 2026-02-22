package PrimeiroResumao;

public class Hyuga extends Ninja implements ByakuganInterface{
    public Hyuga() {
    }

    public Hyuga(String nome, String aldeia, String cla, int idade) {
        super(nome, aldeia, cla, idade);
    }

    /*
    * Implemento da interface ByakuganInterface
    * */
    @Override
    public void ativarByakugan() {
        System.out.println("Sou um Hyuga e tenho acesso ao Byakugan!");
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome: " + getNome());
        System.out.println("Aldeia: " + getAldeia());
        System.out.println("Clã: " + getCla());
        System.out.println("Idade: " + getIdade());
    }
}
