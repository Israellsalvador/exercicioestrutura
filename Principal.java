public class Principal {
    public static void main(String[] args) {
        Lista<String> lista = new Lista<>("Alunos");

        lista.addInicio("Rafael");
        lista.addInicio("Gabriel");
        lista.imprimeLista();

        lista.addFinal("Daniel");
        lista.imprimeLista();

        lista.removeInicio();
        lista.imprimeLista();

        lista.removeFinal();
        lista.imprimeLista();
    }
}
