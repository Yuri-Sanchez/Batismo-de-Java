package PrimeiroResumao;

public abstract class Ninja {
    private String nome;
    private String aldeia;
    private String cla;
    private int idade;

    public Ninja(){
    }

    public Ninja(String nome, String aldeia, String cla, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.cla = cla;
        this.idade = idade;
    }

    public abstract void mostrarInformacoes();

    @Override
    public String toString() {
        return "Utilizando o 'toString' para substituir a o valor da referência de memória";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAldeia() {
        return aldeia;
    }

    public void setAldeia(String aldeia) {
        this.aldeia = aldeia;
    }

    public String getCla() {
        return cla;
    }

    public void setCla(String cla) {
        this.cla = cla;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
