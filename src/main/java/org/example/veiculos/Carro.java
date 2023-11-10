package org.example.veiculos;

import lombok.AllArgsConstructor;

import org.example.acessorios.TanqueCombustivel;
import org.example.motores.Motor;

@AllArgsConstructor
public class Carro {

    public String name;
    private Motor motor;
    private TanqueCombustivel tanqueCombustivel;


    public void ligarCarro(){
        boolean motorPreparado = motor.estaFuncional();
        boolean tanqueVazio = tanqueCombustivel.estaVazio();

        if(motorPreparado && !tanqueVazio){
            System.out.println(name  + " ligado com sucesso!");
        } else {
            System.out.println(name + " está com algum problema!");
        }
    }

}