public class Pessoa{
    private String nome;
    private int idade;
    private Endereco end;

    public Pessoa(){
        this(null, 0, new Endereco());
    }

    public Pessoa(String nome, int idade){
        this(nome, idade, new Endereco());
    }

    public Pessoa(String nome, int idade, Endereco end){
        this.nome = nome;
        this.idade = idade;
        this.end = end;
    }

    public void setEnd(Endereco end){
        this.end = end;
    }

    public Endereco getEnd(){
        return this.end;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public int getIdade(){
        return this.idade;
        
    }

    @Override
    public String toString(){
        return String.format("Pessoa[Nome: %s, Idade: %d, Endereco: %s]",getNome(),getIdade(),end.toString());
    }
}