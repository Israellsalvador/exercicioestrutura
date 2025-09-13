public class Pilha<T> {
    private No<T> topo;

    public Pilha() {
        this.topo = null;
    }

    // push - empilhar
    public void push(T dado) {
        No<T> novoNo = new No<>(dado);
        novoNo.setNextNo(topo);
        topo = novoNo;
    }

    // pop - desempilhar
    public T pop() {
        if (topo == null) {
            System.out.println("Pilha vazia!");
            return null;
        }
        T dado = topo.getDado();
        topo = topo.getNextNo();
        return dado;
    }

    // imprimir pilha
    public void imprime() {
        if (topo == null) {
            System.out.println("Pilha vazia!");
            return;
        }
        System.out.println("Elementos da pilha:");
        No<T> aux = topo;
        while (aux != null) {
            System.out.println(aux.getDado());
            aux = aux.getNextNo();
        }
    }
}
