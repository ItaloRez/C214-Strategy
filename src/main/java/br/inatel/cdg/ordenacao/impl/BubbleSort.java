package br.inatel.cdg.ordenacao.impl;

import br.inatel.cdg.ordenacao.Ordenacao;

public class BubbleSort implements Ordenacao {

    @Override
    public void ordena(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor.length - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
            }
        }
    }
}