package padroesestruturais.flyweight;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CarroTest {

    @Test
    void deveRetornarCompradores() {
        Carro carro = new Carro();
        carro.comprar("Jose", "Brasil", "BR");
        carro.comprar("Maria", "Brasil", "BR");
        carro.comprar("Ana", "Brasil", "BR");
        carro.comprar("Joao", "Argentina", "AR");

        List<String> saida = Arrays.asList(
                "Comprador{nome='Jose', pais='Brasil', sigla='BR'}",
                "Comprador{nome='Maria', pais='Brasil', sigla='BR'}",
                "Comprador{nome='Ana', pais='Brasil', sigla='BR'}",
                "Comprador{nome='Joao', pais='Argentina', sigla='AR'}");

        assertEquals(saida, carro.obterCompradores());
    }

    @Test
    void deveRetornarTotalPaises() {
        Carro carro = new Carro();
        carro.comprar("Jose", "Brasil", "BR");
        carro.comprar("Maria", "Brasil", "BR");
        carro.comprar("Ana", "Brasil", "BR");
        carro.comprar("Joao", "Argentina", "AR");

        assertEquals(2, PaisFactory.getTotalPaises());
    }

}