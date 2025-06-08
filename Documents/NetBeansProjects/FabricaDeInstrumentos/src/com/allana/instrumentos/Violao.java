package com.allana.instrumentos;

public class Violao implements InstrumentoMusical {
    @Override
    public void tocar() {
        System.out.println("Tocando um violão: Dó, Sol, Ré, Lá...");
    }
}