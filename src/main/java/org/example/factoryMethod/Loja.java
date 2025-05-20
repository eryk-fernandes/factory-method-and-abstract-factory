package org.example.factoryMethod;

public class Loja {

    private Veiculo veiculo;

    public Veiculo criarVeiculoLuxo(String tipoVeiculo){
        switch (tipoVeiculo){
            case "moto":
                return new MotoLuxo();
            case "carro":
                return new CarroLuxo();
        }
        return null;
    }
    public Veiculo criarVeiculoEconomico(String tipoVeiculo){
        switch (tipoVeiculo){
            case "moto":
                return new MotoEconomica();
            case "carro":
                return new CarroEconomico();
        }
        return null;
    }
}
