public class Principal{
    public static void main(String[] args){
        Pilha<String> pilha = new Pilha<String>("Letras");

        pilha.push("A");
        System.out.println(pilha.peek());
        pilha.push("B");
        System.out.println(pilha.peek());
        pilha.imprimePilha();
        pilha.push("C");
        System.out.println(pilha.peek());

        System.out.println("DADO: " + pilha.pop() + " Removido");
    }
}