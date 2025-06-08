package com.allana.instrumentos;

public class Bateria implements InstrumentoMusical {
    @Override
    public void tocar() {
        System.out.println("Tocando uma bateria: Tum, tá, pá, tchiii...");
    }
}