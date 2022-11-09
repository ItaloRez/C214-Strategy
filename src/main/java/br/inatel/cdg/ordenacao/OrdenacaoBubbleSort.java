package br.inatel.cdg.ordenacao;

import br.inatel.cdg.ordenacao.Ordenador;
import br.inatel.cdg.ordenacao.impl.BubbleSort;

public class OrdenacaoBubbleSort extends Ordenador {
    
    public OrdenacaoBubbleSort() {
        ordenacao = new BubbleSort();
    }
}