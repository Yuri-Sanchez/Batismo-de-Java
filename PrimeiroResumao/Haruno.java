package PrimeiroResumao;

public class Haruno extends Ninja{
    public Haruno() {
    }

    public Haruno(String nome, String aldeia, String cla, int idade) {
        super(nome, aldeia, cla, idade);
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome: " + getNome());
        System.out.println("Aldeia: " + getAldeia());
        System.out.println("Clã: " + getCla());
        System.out.println("Idade: " + getIdade());
    }
}
