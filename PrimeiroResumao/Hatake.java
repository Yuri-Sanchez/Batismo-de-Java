package PrimeiroResumao;

public class Hatake extends Ninja implements Anbu, Hokage{
    public Hatake() {
    }

    public Hatake(String nome, String aldeia, String cla, int idade) {
        super(nome, aldeia, cla, idade);
    }

    /*
    * Implemento da interface Anbu
    * */
    public void ninjaDeElite(){
        System.out.println("Já fui da organização secreta da aldeia da Folha, mais conhecida como Anbu, somos considerados ninjas de elite");
    }

    /*
    * Implemento da interface Hokages
    * */
    public void hokages(){
        System.out.println("Fui Hokage na aldeia da Folha e sou conhecido como o Ninja copiador");
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome: " + getNome());
        System.out.println("Aldeia: " + getAldeia());
        System.out.println("Clã: " + getCla());
        System.out.println("Idade: " + getIdade());
    }
}
