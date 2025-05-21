package org.example.asbtractFactory;

public class LojaMotoLuxo extends Loja {
    @Override
    public Veiculo criarVeiculo(Veiculo veiculo) {
        return new MotoLuxo();
    }
}
