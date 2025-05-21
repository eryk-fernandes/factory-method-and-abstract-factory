package org.example.factoryMethod;

public class LojaEconomica extends Loja {
    @Override
    public Veiculo criarVeiculo(String tipoVeiculo) {
        switch (tipoVeiculo) {
            case "moto":
                return new MotoEconomica();
            case "carro":
                return new CarroEconomico();
        }
        return null;
    }
}
