package org.example;

import org.example.factoryMethod.Loja;
import org.example.factoryMethod.LojaEconomica;
import org.example.factoryMethod.Veiculo;

public class Main {
    public static void main(String[] args) {

        Loja loja = new LojaEconomica();
        loja.criarVeiculo("moto").descrever();
    }
}