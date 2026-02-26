package NivelIntermediario.Desafio05;

import java.util.ArrayList;
import java.util.List;

public class ContaPoupanca extends ContaBancaria{
    List<Double> saldoPoupanca = new ArrayList<>();

    public void depositar(double valor){
        if (valor <= 0){
            System.out.println("Valor inválido, insira um valor maior ou igual a zero.");
        }else {
            saldoPoupanca.add(valor);
            System.out.println("Depósito de $" + valor + " realizado com sucesso");
        }
    }

    public void consultarSaldo(){
        double soma = 0;
        double somaDesconto = 0;
        for (Double n : saldoPoupanca){
            soma += n;
        }
        somaDesconto = soma - (soma * 0.01);
        System.out.println("Seu saldo é: " + somaDesconto);
    }
}
