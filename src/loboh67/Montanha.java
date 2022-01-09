package loboh67;

public class Montanha extends Corrida {

    private int altitude;

    public Montanha(int velocidadeMedia, int distancia, int altitude) {
        super(velocidadeMedia, distancia);
        this.altitude = altitude;
    }

    public int getAltitude() {
        return altitude;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }

    @Override
    public String tipoCorrida() {
        return "Montanha";
    }

    @Override
    public String toString() {
        return "Montanha{" +
                "distancia=" + distancia +
                ", velocidadeMedia=" + velocidadeMedia +
                ", peChao=" + peChao +
                ", altitude=" + altitude +
                '}';
    }
}
