package org.example;

import org.example.acessorios.TanqueCombustivel;
import org.example.motores.MotorCombustao;
import org.example.veiculos.Carro;

public class App 
{
    public static void main( String[] args )
    {
        MotorCombustao motorCombustao = new MotorCombustao();
        TanqueCombustivel tanqueCombustivel = new TanqueCombustivel(50);
        Carro carro = new Carro("HB20", motorCombustao, tanqueCombustivel);

        MotorCombustao motorCombustao2 = new MotorCombustao();
        TanqueCombustivel tanqueCombustivel2 = new TanqueCombustivel(50);
        Carro carro2 = new Carro("Camaro", motorCombustao2, tanqueCombustivel2);

        carro.ligarCarro();
        carro2.ligarCarro();
    }
}
