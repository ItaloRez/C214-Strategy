package br.inatel.cdg.ordenacao.impl;

import br.inatel.cdg.ordenacao.Ordenacao;

public class SelectionSort implements Ordenacao {

    @Override
    public void ordena(int[] vetor) {
        for (int i = 0; i < vetor.length - 1; i++) {
            int menor = i;
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] < vetor[menor]) {
                    menor = j;
                }
            }
            int aux = vetor[i];

            vetor[i] = vetor[menor];
            vetor[menor] = aux;
        }
    }
}