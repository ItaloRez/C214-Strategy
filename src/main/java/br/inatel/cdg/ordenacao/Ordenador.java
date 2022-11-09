package br.inatel.cdg.ordenacao;

public abstract class Ordenador {
    // Composicao com instancia de Ordenacao
    protected Ordenacao ordenacao;

    // Comportamento delegado
    public void ordena(int[] vetor) {
        ordenacao.ordena(vetor);
    }

    // Getter e Setter
    public void setOrdenacao(Ordenacao ordenacao) {
        this.ordenacao = ordenacao;
    }

    public Ordenacao getOrdenacao() {
        return ordenacao;
    }
}