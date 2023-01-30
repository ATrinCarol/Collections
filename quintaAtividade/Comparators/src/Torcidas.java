public class Torcidas implements Comparable<Torcidas> {

    private final String nome;
    private final Integer totalComponentes;

    public Torcidas(String nome, Integer totalComponentes){
        this.nome = nome;
        this.totalComponentes = totalComponentes;
    }

    public String getNome(){
        return nome;
    }

    public Integer getTotalComponentes(){
        return totalComponentes;
    }

    @Override
    public String toString() { return nome + " - " + totalComponentes;}

    @Override
    public int compareTo(Torcidas o) {
        return this.getTotalComponentes() - o.getTotalComponentes();
    }
}
