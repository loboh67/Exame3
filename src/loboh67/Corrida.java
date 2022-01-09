package loboh67;

public abstract class Corrida extends Locomocao {

    protected int distancia;

    public Corrida(int velocidadeMedia, int distancia) {
        super(velocidadeMedia);
        this.peChao = 1;
        this.distancia = distancia;
    }

    public abstract String tipoCorrida();

    @Override
    public String toString() {
        return "Corrida{" +
                "distancia=" + distancia +
                ", velocidadeMedia=" + velocidadeMedia +
                ", peChao=" + peChao +
                '}';
    }
}
