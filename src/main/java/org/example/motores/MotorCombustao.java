package org.example.motores;

import java.util.Random;

public class MotorCombustao extends Motor{

    @Override
    public boolean estaFuncional() {
        Random random = new Random();
        return random.nextInt(10) < 8;
    }
}
