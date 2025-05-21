package org.example;

import org.example.factoryMethod.Loja;
import org.example.factoryMethod.LojaEconomica;
import org.example.factoryMethod.LojaLuxo;
import org.example.factoryMethod.Veiculo;

public class Main {
    public static void main(String[] args) {

        Loja loja1 = new LojaEconomica();
        loja1.criarVeiculo("moto").descrever();

        Loja loja2 = new LojaLuxo();
        loja2.criarVeiculo("carro").descrever();

    }
}