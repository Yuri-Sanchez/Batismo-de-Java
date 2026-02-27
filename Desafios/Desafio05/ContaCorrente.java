package Desafios.Desafio05;

import java.util.ArrayList;
import java.util.List;

public class ContaCorrente extends ContaBancaria{
    List<Double> historicoDepositos = new ArrayList<>();

    @Override
    public void depositar(double valor){
        if (valor <= 0){
            System.out.println("Valor inválido, insira um valor maior ou igual a zero.");
        }else{
            saldo += valor;
            historicoDepositos.add(valor);
            System.out.println("Depósito de $" + valor + " realizado com sucesso");
        }
    }

    @Override
    public void consultarSaldo(){
        System.out.println("Seu saldo é: " + saldo);
        System.out.println("Histórico de depósitos: " + historicoDepositos);
    }
}
