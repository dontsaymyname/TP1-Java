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
        Carro carro = new Carro(motorCombustao, tanqueCombustivel);

        carro.ligarCarro();
    }
}
