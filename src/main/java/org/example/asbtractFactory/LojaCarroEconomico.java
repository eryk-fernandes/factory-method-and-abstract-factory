package org.example.asbtractFactory;

public class LojaCarroEconomico extends Loja{

    @Override
    public Veiculo criarVeiculo(Veiculo veiculo) {
        return new CarroEconomico();
    }
}
