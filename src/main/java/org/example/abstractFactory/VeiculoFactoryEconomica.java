package org.example.abstractFactory;

public class VeiculoFactoryEconomica extends LojaFactory {

    @Override
    public VeiculoMoto criarVeiculoMoto() {
        return new MotoEconomica();
    }

    @Override
    public VeiculoCarro criarVeiculoCarro() {
        return new CarroEconomico();
    }
}
