package montadora;

import java.util.HashMap;
import java.util.Map;

public class PaisFactory {
    private static Map<String, Pais> paises = new HashMap<>();

    public static Pais getPais(String nome, String sigla) {
        Pais pais = paises.get(nome);
        if (pais == null) {
            pais = new Pais(nome, sigla);
            paises.put(nome, pais);
        }
        return pais;
    }

    public static int getTotalPaises() {
        return paises.size();
    }

}




