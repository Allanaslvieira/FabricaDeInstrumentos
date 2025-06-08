package com.allana.instrumentos;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Testando a Fábrica de Instrumentos ---");

        InstrumentoMusical meuViolao = FabricaDeInstrumentos.criarInstrumento("violao");
        if (meuViolao != null) {
            meuViolao.tocar();
        }

        InstrumentoMusical meuTeclado = FabricaDeInstrumentos.criarInstrumento("teclado");
        if (meuTeclado != null) {
            meuTeclado.tocar();
        }

        // CORREÇÃO: Usar criarInstrumento aqui também!
        InstrumentoMusical minhaBateria = FabricaDeInstrumentos.criarInstrumento("bateria");
        if (minhaBateria != null) {
            minhaBateria.tocar();
        }

        InstrumentoMusical instrumentoDesconhecido = FabricaDeInstrumentos.criarInstrumento("flauta");
        if (instrumentoDesconhecido == null) {
            System.out.println("Atenção: Não foi possível criar o instrumento 'flauta'.");
        }

        System.out.println("--- Teste Finalizado ---");
    }
}