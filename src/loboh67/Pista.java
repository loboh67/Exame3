package loboh67;

public class Pista extends Corrida {

    private String nome;
    private int comprimento;

    public Pista(int velocidadeMedia, int distancia, String nome, int comprimento) {
        super(velocidadeMedia, distancia);
        this.nome = nome;
        this.comprimento = comprimento;
    }

    @Override
    public String tipoCorrida() {
        return "Pista";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getComprimento() {
        return comprimento;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }

    @Override
    public String toString() {
        return "Pista{" +
                "distancia=" + distancia +
                ", velocidadeMedia=" + velocidadeMedia +
                ", peChao=" + peChao +
                ", nome='" + nome + '\'' +
                ", comprimento=" + comprimento +
                '}';
    }
}
