package NivelIntermediario.Desafio05;

import java.util.ArrayList;
import java.util.List;

public class ContaCorrente extends ContaBancaria{
    List<Double> saldoCorrente = new ArrayList<>();

    @Override
    public void depositar(double valor){
        if (valor <= 0){
            System.out.println("Valor inválido, insira um valor maior ou igual a zero.");
        }else{
            saldoCorrente.add(valor);
            System.out.println("Depósito de $" + valor + " realizado com sucesso");
        }
    }

    @Override
    public void consultarSaldo(){
        double soma = 0.0;
        for (Double n : saldoCorrente){
            soma += n;
        }
        System.out.println("Seu saldo é: " + soma);
    }
}
