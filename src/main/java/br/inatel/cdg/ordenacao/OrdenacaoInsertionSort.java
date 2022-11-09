package br.inatel.cdg.ordenacao;

import br.inatel.cdg.ordenacao.Ordenador;
import br.inatel.cdg.ordenacao.impl.InsertionSort;

public class OrdenacaoInsertionSort extends Ordenador {
    
    public OrdenacaoInsertionSort() {
        ordenacao = new InsertionSort();
    }
}