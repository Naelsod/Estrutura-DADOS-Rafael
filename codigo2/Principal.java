public class Principal{
    public static void main(String[] args) {
        //Lista de Alunos
        Lista<String> lista = new Lista<String>("Alunos");

        lista.addInicio("Daniel");
        lista.addInicio("Gabriel");
        lista.addInicio("Danielly");

        lista.removeInicio();
    }
}