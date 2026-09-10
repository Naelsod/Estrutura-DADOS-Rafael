public class Pilha {
    private String nomePilha;
    private No<T> topo;

    public pilha(){
        this(null,null);
    }
    public pilha(String nomePilha){
        this.nomePilha = nomePilha;
        this.topo = null;
    }

    public Pilha(String nomePilha, T topo) {
        this.nomePilha = nomePilha;
        this.topo = topo;
    }
    public String getNomePilha() {
        return nomePilha;
    }
    public void setNomePilha(String nomePilha) {
        this.nomePilha = nomePilha;
    }
    public T getTopo() {
        return topo;
    }
    public void setTopo(T topo) {
        this.topo = topo;
    }

}
