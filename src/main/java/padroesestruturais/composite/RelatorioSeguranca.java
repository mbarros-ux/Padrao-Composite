package padroesestruturais.composite;

public class RelatorioSeguranca {

    private ElementoSeguranca raiz;

    public void setRaiz(ElementoSeguranca raiz) {
        this.raiz = raiz;
    }

    public String getRelatorio() {
        if (this.raiz == null) {
            throw new NullPointerException("Relatorio sem elemento raiz");
        }
        return this.raiz.getDetalhes();
    }
}