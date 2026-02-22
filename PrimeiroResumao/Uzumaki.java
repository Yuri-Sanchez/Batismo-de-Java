package PrimeiroResumao;

public class Uzumaki extends Ninja{
    Bijus biju;

    public Uzumaki (){
    }

    public Uzumaki(String nome, String aldeia, String cla, int idade){
        super(nome, aldeia, cla, idade);
    }

    public Uzumaki(String nome, String aldeia, String cla, int idade, Bijus biju){
        super(nome, aldeia, cla, idade);
        this.biju = biju;
    }

    @Override
    public void mostrarInformacoes(){
        System.out.println("Nome: " + getNome());
        System.out.println("Aldeia: " + getAldeia());
        System.out.println("Clã: " + getCla());
        System.out.println("Idade: " + getIdade());
        System.out.println("Descrição Biju - Nome: " + biju.getNomeBiju() + " , Caldas: " + biju.getNumeroDeCaldas() + " , Portador: " + biju.getNomeDoPortador());
    }
}
