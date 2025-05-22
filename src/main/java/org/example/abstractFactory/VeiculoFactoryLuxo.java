package org.example.abstractFactory;

public class VeiculoFactoryLuxo extends LojaFactory {

    @Override
    public VeiculoMoto criarVeiculoMoto() {
        return new MotoLuxo();
    }

    @Override
    public VeiculoCarro criarVeiculoCarro() {
        return new CarroLuxo();
    }
}
