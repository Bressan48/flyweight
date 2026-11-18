package montadora;

public class Comprador {

    private String nome;
    private Pais paisResidencia;

    public Comprador(String nome, Pais paisResidencia) {
        this.nome = nome;
        this.paisResidencia = paisResidencia;
    }

    public String obterComprador() {
        return "Comprador{" +
                "nome='" + this.nome + '\'' +
                ", pais='" + paisResidencia.getNome() + '\'' +
                ", sigla='" + paisResidencia.getSigla() + '\'' +
                '}';
    }
}
