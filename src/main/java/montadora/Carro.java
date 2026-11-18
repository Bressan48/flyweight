package montadora;

import java.util.ArrayList;
import java.util.List;

public class Carro {

    private List<Comprador> compradores = new ArrayList<>();

    public void comprar(String nomeComprador, String nomePais, String sigla) {
        Pais pais = PaisFactory.getPais(nomePais, sigla);
        Comprador comprador = new Comprador(nomeComprador, pais);
        compradores.add(comprador);
    }

    public List<String> obterCompradores() {
        List<String> saida = new ArrayList<String>();
        for (Comprador comprador : this.compradores) {
            saida.add(comprador.obterComprador());
        }
        return saida;
    }


}
