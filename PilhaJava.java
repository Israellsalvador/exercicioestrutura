class Pilha<T> {
    private No<T> topo;

    public Pilha() {
        topo = null;
    }

    public void push(T dado) {
        No<T> novoNo = new No<T>(dado, topo);
        topo = novoNo;
    }

    public T pop() {
        if (topo == null) {
            System.out.println("A pilha está vazia!");
            return null;
        }
        T dado = topo.getDado();
        topo = topo.getNextNo();
        return dado;
    }

    public void imprimir() {
        if (topo == null) {
            System.out.println("Pilha vazia!");
        } else {
            System.out.println("Elementos da pilha:");
            No<T> aux = topo;
            while (aux != null) {
                System.out.println(aux.getDado());
                aux = aux.getNextNo();
            }
        }
    }
}

// Testando a Pilha
class TestaPilha {
    public static void main(String[] args) {
        Pilha<String> pilha = new Pilha<>();

        pilha.push("Java");
        pilha.push("Python");
        pilha.push("C#");
        pilha.push("C++");

        System.out.println("Removido do topo: " + pilha.pop());

        pilha.imprimir();
    }
}
