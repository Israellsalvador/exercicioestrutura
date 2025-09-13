public class Principal {
    public static void main(String[] args) {
        // Testando a Pilha
        Pilha<String> pilha = new Pilha<>();
        pilha.push("Java");
        pilha.push("C");
        pilha.push("Python");
        pilha.imprime();
        System.out.println("Pop: " + pilha.pop());
        pilha.imprime();

        System.out.println("----------------------------");

        // Testando a Fila
        Fila<String> fila = new Fila<>();
        fila.enqueue("João");
        fila.enqueue("Maria");
        fila.enqueue("Carlos");
        fila.imprime();
        System.out.println("Dequeue: " + fila.dequeue());
        fila.imprime();

        System.out.println("----------------------------");

        // Testando a Lista
        Lista<String> lista = new Lista<>("Alunos");
        lista.addInicio("Rafael");
        lista.addInicio("Gabriel");
        lista.addFinal("Daniel");
        lista.imprimeLista();
        lista.removeInicio();
        lista.imprimeLista();
        lista.removeFinal();
        lista.imprimeLista();
    }
}
