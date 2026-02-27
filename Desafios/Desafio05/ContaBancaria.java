package Desafios.Desafio05;

public abstract class ContaBancaria implements Conta{
    double saldo;

    public ContaBancaria() {
        this.saldo = 0.0;
    }

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    @Override
    public abstract void consultarSaldo();

    @Override
    public abstract void depositar(double valor);
}
