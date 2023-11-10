package org.example.acessorios;

public class TanqueCombustivel {

    int valorAtualLitros;

    public TanqueCombustivel(int valorAtualLitros) {
        this.valorAtualLitros = valorAtualLitros;
    }


    public boolean estaVazio() {
        return valorAtualLitros <= 0;
    }
}
