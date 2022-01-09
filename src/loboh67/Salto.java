package loboh67;

public abstract class Salto extends Locomocao {

    public Salto(int velocidadeMedia) {
        super(velocidadeMedia);
        this.peChao = 0;
    }

    public abstract String tipoSalto();

    @Override
    public String toString() {
        return "Salto{" +
                "velocidadeMedia=" + velocidadeMedia +
                ", peChao=" + peChao +
                '}';
    }

}
