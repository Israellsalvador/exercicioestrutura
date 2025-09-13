import java.util.LinkedList;

class Produto {
    int id;
    String nome;
    double preco;

    Produto(int id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "ID: " + id + " | Nome: " + nome + " | Preço: " + preco;
    }
}

public class ListaEncadeadaJava {
    public static void main(String[] args) {
        // Cria a lista encadeada
        LinkedList<Produto> lista = new LinkedList<>();

        // Adiciona produtos
        lista.add(new Produto(1, "Mouse", 79.90));
        lista.add(new Produto(2, "Teclado", 149.90));
        lista.add(new Produto(3, "Monitor", 999.90));

        // Imprime a lista de produtos
        System.out.println("Produtos na lista:");
        for (Produto p : lista) {
            System.out.println(p);
        }

        // Remove um produto do início da lista
        Produto removido = lista.removeFirst();
        System.out.println("\nProduto removido: " + removido);

        // Imprime novamente a lista
        System.out.println("\nProdutos restantes:");
        for (Produto p : lista) {
            System.out.println(p);
        }
    }
}
