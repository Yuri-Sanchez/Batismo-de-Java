package NivelIntermediario.Desafio05;

public abstract class ContaBancaria implements Conta{
    double saldo;
    double valor;

    public ContaBancaria() {
    }

    public ContaBancaria(double saldo, double valor) {
        this.saldo = saldo;
        this.valor = valor;
    }

    @Override
    public abstract void consultarSaldo();

    @Override
    public abstract void depositar(double valor);
}
