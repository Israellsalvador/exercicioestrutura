public class Fila<T> {
    private No<T> inicio;
    private No<T> fim;

    public Fila() {
        this.inicio = null;
        this.fim = null;
    }

    // enqueue - adicionar no fim
    public void enqueue(T dado) {
        No<T> novoNo = new No<>(dado);
        if (fim == null) {
            inicio = novoNo;
            fim = novoNo;
        } else {
            fim.setNextNo(novoNo);
            fim = novoNo;
        }
    }

    // dequeue - remover do início
    public T dequeue() {
        if (inicio == null) {
            System.out.println("Fila vazia!");
            return null;
        }
        T dado = inicio.getDado();
        inicio = inicio.getNextNo();
        if (inicio == null) {
            fim = null;
        }
        return dado;
    }

    // imprimir fila
    public void imprime() {
        if (inicio == null) {
            System.out.println("Fila vazia!");
            return;
        }
        System.out.println("Elementos da fila:");
        No<T> aux = inicio;
        while (aux != null) {
            System.out.println(aux.getDado());
            aux = aux.getNextNo();
        }
    }
}
