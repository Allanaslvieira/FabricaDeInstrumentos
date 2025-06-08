package com.allana.instrumentos;

public class FabricaDeInstrumentos {
    public static InstrumentoMusical criarInstrumento(String tipo) {
        if (tipo.equalsIgnoreCase("violao")) {
            return new Violao();
        } else if (tipo.equalsIgnoreCase("teclado")) {
            return new Teclado();
        } else if (tipo.equalsIgnoreCase("bateria")) {
            return new Bateria();
        } else {
            System.out.println("Tipo de instrumento desconhecido: " + tipo);
            return null;
        }
    }
}