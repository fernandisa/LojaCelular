
package lojacelular;

public class Modelo {
    
    private String nome;
    private Double memoria;
    private Integer chips;
    private Fabricante fabricante;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    public Double getMemoria() {
        return memoria;
    }

    public void setMemoria(Double memoria) {
        this.memoria = memoria;
    }

    public Integer getChips() {
        return chips;
    }

    public void setChips(Integer chips) {
        this.chips = chips;
    }

   
    
    
}
