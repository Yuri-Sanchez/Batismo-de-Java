package NivelIntermediario.Desafio04;

public class Main {
    static void main(String[] args) {
        //Objeto 1 (Sem construtor)
        /*NinjaBasico Boruto = new NinjaBasico();
        Boruto.nome = "Boruto Uzumaki Hyuga";
        Boruto.idade = 14;
        Boruto.habilidade = "O karma";
        Boruto.especialidade = "Ninjutsu";
        Boruto.mostrarInformacoes();
        Boruto.executarHabilidade();

        //Objeto 2 (Sem construtor)
        NinjaAvancado Naruto = new NinjaAvancado();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.idade = 25;
        Naruto.habilidade = "Hasengan";
        Naruto.especialidade = "Katon";
        Naruto.mostrarInformacoes();
        Naruto.executarHabilidade();*/

        // Utilizando construtores
        NinjaBasico Sasuke = new NinjaBasico(
                "Sasuke Uchiha",
                16,
                "Chidori",
                TipoHabilidade.KATON
        );
        Sasuke.mostrarInformacoes();
        Sasuke.executarHabilidade();

        NinjaAvancado Naruto = new NinjaAvancado(
                "Naruto",
                16,
                "Hasengan",
                TipoHabilidade.GENJUTSU
        );
        Naruto.mostrarInformacoes();
        Naruto.executarHabilidade();
    }
}
