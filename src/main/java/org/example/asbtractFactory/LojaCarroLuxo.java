package org.example.asbtractFactory;

public class LojaCarroLuxo extends Loja {
    @Override
    public Veiculo criarVeiculo(Veiculo veiculo) {
        return new CarroLuxo();
    }
}
