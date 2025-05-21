package org.example.asbtractFactory;

public class LojaMotoEconomica extends Loja {
    @Override
    public Veiculo criarVeiculo(Veiculo veiculo) {
        return new MotoEconomica();
    }
}
