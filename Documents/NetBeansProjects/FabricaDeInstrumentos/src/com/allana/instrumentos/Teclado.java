package com.allana.instrumentos;

public class Teclado implements InstrumentoMusical {
    @Override
    public void tocar() {
        System.out.println("Tocando um teclado: Sons de piano, sintetizador...");
    }
}