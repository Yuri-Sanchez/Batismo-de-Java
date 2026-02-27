package Desafios.Desafio05;

import java.util.ArrayList;
import java.util.List;

public class ContaPoupanca extends ContaBancaria{
    List<Double> historicoDepositos = new ArrayList<>();

    @Override
    public void depositar(double valor){
        if (valor <= 0){
            System.out.println("Valor inválido! Insira um valor maior ou igual a zero.");
        }else {
            double taxa = valor * 0.01;
            double valorLiquido = valor - taxa;

            saldo += valorLiquido;
            historicoDepositos.add(valor);

            System.out.println("Depósito de $" + valor + " realizado com sucesso");
            System.out.println("Taxa de 1%: R$ " + taxa);
            System.out.println("Valor creditado: R$ " + valorLiquido);
        }
    }

    @Override
    public void consultarSaldo(){
        System.out.println("Seu saldo é: " + saldo);

        System.out.println("Histórico de depósitos (valores brutos): " + historicoDepositos);
    }
}
