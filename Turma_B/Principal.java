import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Principal{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        Pessoa obj1 = new Pessoa();
        Pessoa obj2 = new Pessoa("Rafael", 32);
        Pessoa obj3 = new Pessoa();

        System.out.print("Digite o nome:");
        /*String nome = input.nextLine(); */
        obj3.setNome(input.nextLine());

        System.out.print("Digite a idade:");
        obj3.setIdade(input.nextInt());
        /* int idade = input.nextInt(); * / 

        /* obj3.setPessoa(input.nextLine(),input.nextInt()); */

        ArrayList<Pessoa> listaP = new ArrayList<Pessoa>();

        listaP.add(obj1);
        listaP.add(obj2);
        listaP.add(obj3);
        /*
        for(Pessoa auxP : listaP){
            System.out.println(auxP.toString());
        }
        */
        

        input.close();
        
        /*
        System.out.println("NOME:" + obj1.getNome());
        System.out.println("idade:" + obj1.getIdade());
        System.out.println("NOME:" + obj2.getNome());
        System.out.println("idade:" + obj2.getIdade());
        System.out.println("NOME:" + obj3.getNome());
        System.out.println("idade:" + obj3.getIdade());
        */

       /*
        System.out.println(obj1.toString());
        System.out.println(obj2.toString());
        System.out.println(obj3.toString());
        */
    }
}