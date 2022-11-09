package br.inatel.cdg.ordenacao;

import br.inatel.cdg.ordenacao.Ordenador;
import br.inatel.cdg.ordenacao.impl.SelectionSort;

public class OrdenacaoSelectionSort extends Ordenador {
    
    public OrdenacaoSelectionSort() {
        ordenacao = new SelectionSort();
    }
}