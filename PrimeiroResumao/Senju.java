package PrimeiroResumao;

public class Senju extends Ninja implements Hokage{
    public Senju() {
    }

    public Senju(String nome, String aldeia, String cla, int idade) {
        super(nome, aldeia, cla, idade);
    }

    /*
    * Implemento da interface Hokage
    * */
    @Override
    public void hokages() {
        System.out.println("Fui Hokage da vila da folha e fiquei conhecido como Deus Shinobi");
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome: " + getNome());
        System.out.println("Aldeia: " + getAldeia());
        System.out.println("Clã: " + getCla());
        System.out.println("Idade: " + getIdade());
    }
}
