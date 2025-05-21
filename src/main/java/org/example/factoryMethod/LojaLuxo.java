package org.example.factoryMethod;

public class LojaLuxo extends Loja {
    @Override
    public Veiculo criarVeiculo(String tipoVeiculo) {
        switch (tipoVeiculo) {
            case "moto":
                return new MotoLuxo();
            case "carro":
                return new CarroLuxo();
        }
        return null;
    }
}
