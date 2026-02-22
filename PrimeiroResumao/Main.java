package PrimeiroResumao;

public class Main {
    static void main(String[] args) {
        System.out.println("---------- Naruto Uzumaki ----------");
        Uzumaki naruto = new Uzumaki("Naruto Uzumki", "Aldeia da Folha", "Uzumaki", 25, Bijus.KURAMA);
        naruto.mostrarInformacoes();
        System.out.println(naruto);
        System.out.print("\n");


        System.out.println("---------- Hinata Hyuga ----------");
        Hyuga hinata = new Hyuga("Hinata Hyuga", "Aldeia da Folha", "Hyuga", 23);
        hinata.mostrarInformacoes();
        hinata.ativarByakugan();
        System.out.println(hinata);
        System.out.print("\n");

        System.out.println("---------- Boruto Hyuga Uzumaki ----------");
        Boruto boruto = new Boruto("Boruto Hyuga Uzumaki", "Aldeia da Folha", "Uzumaki e Hyuga", 14);
        boruto.mostrarInformacoes();
        boruto.uzumakiHyuga();
        System.out.println(boruto);
        System.out.print("\n");

        System.out.println("---------- Sasuke Uchiha ----------");
        Uchiha sasuke = new Uchiha("Sasuke Uchiha", "Aldeia da Folha", "Uchiha", 26);
        sasuke.mostrarInformacoes();
        sasuke.ativarSharingan();
        System.out.println(sasuke);
        System.out.print("\n");

        System.out.println("---------- Sakura Haruno ----------");
        Haruno sakura = new Haruno("Sakura Haruno", "Aldeia da Folha", "Uchiha", 24);
        sakura.mostrarInformacoes();
        System.out.println(sakura);
        System.out.print("\n");

        System.out.println("---------- Hashirama Senju ----------");
        Senju hashirama = new Senju("Hashirama Senju", "Aldeia da Folha", "Senju", 42);
        hashirama.mostrarInformacoes();
        hashirama.hokages();
        System.out.println(hashirama);
        System.out.print("\n");

        System.out.println("---------- Kakashi Hatake ----------");
        Hatake kakashi = new Hatake("Kakashi Hatake", "Aldeia da Folha", "Hatake", 38);
        kakashi.mostrarInformacoes();
        kakashi.ninjaDeElite();
        kakashi.hokages();
        System.out.println(kakashi);
    }
}
