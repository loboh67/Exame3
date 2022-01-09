package loboh67;

import java.util.ArrayList;
import java.util.Comparator;

public class Locomocao {

    protected int velocidadeMedia;
    protected int peChao;

    public Locomocao(int velocidadeMedia) {
        this.velocidadeMedia = velocidadeMedia;
    }

    public static void cidades (ArrayList<Locomocao> listaLocomocao) {
        for (Locomocao l : listaLocomocao) {
            if (l.getPeChao() == 1) {
                Corrida corrida = (Corrida) l;
                if (corrida.tipoCorrida().equals("Cidade")) {
                    Cidade cidade = (Cidade) corrida;
                    System.out.println(cidade.getNome());
                }
            }
        }
    }

    public static  void ordena(ArrayList<Locomocao> listaLocomocao) {
        listaLocomocao.sort(Comparator.comparingInt(Locomocao::getVelocidadeMedia));
    }

    public int getPeChao() {
        return peChao;
    }

    public int getVelocidadeMedia() {
        return velocidadeMedia;
    }

    @Override
    public String toString() {
        return "Locomocao{" +
                "velocidadeMedia=" + velocidadeMedia +
                ", peChao=" + peChao +
                '}';
    }
}
