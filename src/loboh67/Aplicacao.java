package loboh67;

import java.util.ArrayList;

public class Aplicacao {

    ArrayList<Locomocao> listaLocomocao;

    public static void main(String[] args) {
        ArrayList<Locomocao> listaLocomocao = new ArrayList<>();
        Cidade c1 = new Cidade(14, 1000, "Guarda");
        Cidade c2 = new Cidade(12, 2500, "Lisboa");
        Cidade c3 = new Cidade(15, 3600, "Porto");
        Caminhada c4 = new Caminhada(5);
        Montanha m1 = new Montanha(10, 2000, 2500);

        listaLocomocao.add(c1);
        listaLocomocao.add(c2);
        listaLocomocao.add(c3);
        listaLocomocao.add(c4);
        listaLocomocao.add(m1);

        Locomocao.cidades(listaLocomocao);
        Locomocao.ordena(listaLocomocao);
        System.out.println(listaLocomocao);
    }

    public Aplicacao(ArrayList<Locomocao> listaLocomocao) {
        this.listaLocomocao = listaLocomocao;
    }
}
