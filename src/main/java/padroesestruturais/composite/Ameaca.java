package padroesestruturais.composite;

public class Ameaca extends ElementoSeguranca {

    private int nivelRisco;

    public Ameaca(String descricao, int nivelRisco) {
        super(descricao);
        this.nivelRisco = nivelRisco;
    }

    public int getNivelRisco() {
        return nivelRisco;
    }

    public void setNivelRisco(int nivelRisco) {
        this.nivelRisco = nivelRisco;
    }

    public String getDetalhes() {
        return "Ameaca: " + this.getDescricao() + " - Nivel de Risco: " + this.nivelRisco + "\n";
    }
}