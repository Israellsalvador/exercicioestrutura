class Fila<T> {
    private No<T> primeiro;
    private No<T> ultimo;

    public Fila() {
        primeiro = null;
        ultimo = null;
    }

    public void enfileirar(T dado) {
        No<T> novoNo = new No<T>(dado);
        if (ultimo == null) {
            primeiro = novoNo;
            ultimo = novoNo;
        } else {
            ultimo.setNextNo(novoNo);
            ultimo = novoNo;
        }
    }

    public T desenfileirar() {
        if (primeiro == null) {
            System.out.println("Fila vazia!");
            return null;
        }
        T dado = primeiro.getDado();
        primeiro = primeiro.getNextNo();
        if (primeiro == null) {
            ultimo = null;
        }
        return dado;
    }

    public void imprimir() {
        if (primeiro == null) {
            System.out.println("Fila vazia!");
        } else {
            System.out.println("Elementos da fila:");
            No<T> aux = primeiro;
            while (aux != null) {
                System.out.println(aux.getDado());
                aux = aux.getNextNo();
            }
        }
    }
}

// Testando a Fila
class TestaFila {
    public static void main(String[] args) {
        Fila<String> fila = new Fila<>();

        fila.enfileirar("Maria");
        fila.enfileirar("José");
        fila.enfileirar("Ana");
        fila.enfileirar("Pedro");

        System.out.println("Primeiro removido da fila: " + fila.desenfileirar());

        fila.imprimir();
    }
}
