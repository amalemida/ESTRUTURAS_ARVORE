public class Programa {
    public static void main(String[] args) {
        ArvoreBinariaBusca arvore = new ArvoreBinariaBusca();
        arvore.inserir(6);
        arvore.inserir(4);
        arvore.inserir(8);
        arvore.inserir(3);
        arvore.inserir(5);
        arvore.inserir(7);
        arvore.inserir(9);
        
        int valor = 8;
        System.out.println("O número " + valor + " existe? " + arvore.busca(valor));
    }
}
