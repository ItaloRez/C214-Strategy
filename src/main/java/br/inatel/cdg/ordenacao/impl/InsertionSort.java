package br.inatel.cdg.ordenacao.impl;

import br.inatel.cdg.ordenacao.Ordenacao;

public class InsertionSort implements Ordenacao {

    @Override
    public void ordena(int[] vetor) {
        for (int i = 1; i < vetor.length; i++) {
            int j = i;
            while (j > 0 && vetor[j] < vetor[j - 1]) {
                int aux = vetor[j];
                vetor[j] = vetor[j - 1];
                vetor[j - 1] = aux;
                j--;
            }
        }
    }
}