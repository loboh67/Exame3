package loboh67;

public class Caminhada extends Locomocao {

    public Caminhada(int velocidadeMedia) {
        super(velocidadeMedia);
        this.peChao = 2;
    }

    @Override
    public String toString() {
        return "Caminhada{" +
                "velocidadeMedia=" + velocidadeMedia +
                ", peChao=" + peChao +
                '}';
    }

}
