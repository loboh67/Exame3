package loboh67;

public class Cidade extends Corrida {

    private String nome;

    public Cidade(int velocidadeMedia, int distancia, String nome) {
        super(velocidadeMedia, distancia);
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String tipoCorrida() {
        return "Cidade";
    }

    @Override
    public String toString() {
        return "Cidade{" +
                "nome='" + nome + '\'' +
                ", distancia=" + distancia +
                ", velocidadeMedia=" + velocidadeMedia +
                ", peChao=" + peChao +
                '}';
    }
}
