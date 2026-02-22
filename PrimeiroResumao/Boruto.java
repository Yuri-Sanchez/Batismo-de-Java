package PrimeiroResumao;

public class Boruto extends Ninja implements HyugaUzumaki{
    public Boruto() {
    }

    public Boruto(String nome, String aldeia, String cla, int idade) {
        super(nome, aldeia, cla, idade);
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome: " + getNome());
        System.out.println("Aldeia: " + getAldeia());
        System.out.println("Clã: " + getCla());
        System.out.println("Idade: " + getIdade());
    }

    /*
    * Implemento da interface HyugaUzumaki
    * */
    @Override
    public void uzumakiHyuga(){
        System.out.println("Meu nome é " + getNome() + ", e eu faço parte da família Uzumaki e Hyuga");
    }
}
