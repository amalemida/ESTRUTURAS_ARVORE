public class ArvoreBinariaBusca {

    private final class No {
        public int valor;
        public No esquerda, direita;

        public No(int valor) {
            this.valor = valor;
            this.esquerda = null;
            this.direita = null;
        } 
    }

    public No raiz;

    private No inserirRecursivamente(No atual, int valor) {
        if (atual == null) {
            return new No(valor);
        }

        if (valor < atual.valor) {
            atual.esquerda = inserirRecursivamente(atual.esquerda, valor);
        }
        else if (valor > atual.valor) {
            atual.direita = inserirRecursivamente(atual.direita, valor);
        }
        return atual;
    }

    public void inserir(int valor) {
        raiz = inserirRecursivamente(raiz, valor);
    }

    public void emOrdem(No no) {
        if (no != null) {
            emOrdem(no.esquerda);
            System.out.println(" " + no.valor);
            emOrdem(no.direita);
        }
    }

    public void preOrdem(No no) {
        if (no != null) {
            System.out.println(" " + no.valor);
            preOrdem(no.esquerda);
            preOrdem(no.direita);
        }
    }

    public void posOrdem(No no) {
        if (no != null) {
            posOrdem(no.esquerda);
            posOrdem(no.direita);
            System.out.println(" " + no.valor);
        }
    }

    private boolean buscaRecursiva(No atual, int valor) {
        if (atual == null) {
            return false;
        }
        if (valor == atual.valor) {
            return true;
        }
        if (valor < atual.valor) {
            return buscaRecursiva(atual.esquerda, valor);
        }
        return buscaRecursiva(atual.direita, valor);
    }

    public boolean busca(int valor) {
        return buscaRecursiva(raiz, valor);
    }
}
