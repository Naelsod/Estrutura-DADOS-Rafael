public class Principal{
    public static void main(String[] args){
        Pessoa obj1 = new Pessoa();
        Pessoa obj2 = new Pessoa("Rafael", 32);
        
        System.out.println("NOME:" + obj1.getNome());
        System.out.println("idade:" + obj1.getIdade());
        System.out.println("NOME:" + obj2.getNome());
        System.out.println("idade:" + obj2.getIdade());

        System.out.println(obj1.toString());
        System.out.println(obj2.toString());
    }
}