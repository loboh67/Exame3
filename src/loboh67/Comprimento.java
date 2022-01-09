package loboh67;

public class Comprimento extends Salto {

    public Comprimento(int velocidadeMedia) {
        super(velocidadeMedia);
    }

    @Override
    public String tipoSalto() {
        return "Comprimento";
    }

    @Override
    public String toString() {
        return "Comprimento{" +
                "velocidadeMedia=" + velocidadeMedia +
                ", peChao=" + peChao +
                '}';
    }

}
