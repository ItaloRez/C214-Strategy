package br.inatel.cdg.ordenacao;

import br.inatel.cdg.ordenacao.Ordenador;
import br.inatel.cdg.ordenacao.impl.QuickSort;

public class OrdenacaoQuickSort extends Ordenador {
    
    public OrdenacaoQuickSort() {
        ordenacao = new QuickSort();
    }
}