package br.inatel.cdg.teste.ordenacao;


import br.inatel.cdg.ordenacao.*;
import br.inatel.cdg.ordenacao.impl.BubbleSort;
import br.inatel.cdg.ordenacao.impl.InsertionSort;
import br.inatel.cdg.ordenacao.impl.QuickSort;
import br.inatel.cdg.ordenacao.impl.SelectionSort;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestOrdenador {

    Ordenador ordenador;

    public void testeBubbleSort() {
        ordenador = new OrdenacaoBubbleSort();
        assertTrue(ordenador.getOrdenacao() instanceof BubbleSort);
    }

    @Test
    public void testBubbleSortOrdenar() {
        ordenador = new OrdenacaoBubbleSort();
        int[] vetor = {5, 4, 3, 2, 1};
        ordenador.ordena(vetor);
        int[] vetorOrdenado = {1, 2, 3, 4, 5};
        assertArrayEquals(vetorOrdenado, vetor);
    }

    @Test
    public void testSelectionSort() {
        ordenador = new OrdenacaoSelectionSort();
        assertTrue(ordenador.getOrdenacao() instanceof SelectionSort);
    }

    @Test
    public void testSelectionSortOrdenar() {
        ordenador = new OrdenacaoSelectionSort();
        int[] vetor = {5, 4, 3, 2, 1};
        ordenador.ordena(vetor);
        int[] vetorOrdenado = {1, 2, 3, 4, 5};
        assertArrayEquals(vetorOrdenado, vetor);
    }

    @Test
    public void testInsertionSort() {
        ordenador = new OrdenacaoInsertionSort();
        assertTrue(ordenador.getOrdenacao() instanceof InsertionSort);
    }    

    @Test
    public void testInsertionSortOrdenar() {
        ordenador = new OrdenacaoInsertionSort();
        int[] vetor = {5, 4, 3, 2, 1};
        ordenador.ordena(vetor);
        int[] vetorOrdenado = {1, 2, 3, 4, 5};
        assertArrayEquals(vetorOrdenado, vetor);
    }

    @Test
    public void testQuickSort() {
        ordenador = new OrdenacaoQuickSort();
        assertTrue(ordenador.getOrdenacao() instanceof QuickSort);
    }

    @Test
    public void testQuickSortOrdenar() {
        ordenador = new OrdenacaoQuickSort();
        int[] vetor = {5, 4, 3, 2, 1};
        ordenador.ordena(vetor);
        int[] vetorOrdenado = {1, 2, 3, 4, 5};
        assertArrayEquals(vetorOrdenado, vetor);
    }
}