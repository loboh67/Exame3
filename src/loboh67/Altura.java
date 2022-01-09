package loboh67;

public class Altura extends Salto {

    public Altura(int velocidadeMedia) {
        super(velocidadeMedia);
    }

    @Override
    public String tipoSalto() {
        return "Altura";
    }

    @Override
    public String toString() {
        return "Altura{" +
                "velocidadeMedia=" + velocidadeMedia +
                ", peChao=" + peChao +
                '}';
    }

}
