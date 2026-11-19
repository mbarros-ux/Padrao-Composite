package padroesestruturais.composite;

import java.util.ArrayList;
import java.util.List;

public class GrupoAmeacas extends ElementoSeguranca {

    private List<ElementoSeguranca> elementos;

    public GrupoAmeacas(String descricao) {
        super(descricao);
        this.elementos = new ArrayList<ElementoSeguranca>();
    }

    public void addElemento(ElementoSeguranca elemento) {
        this.elementos.add(elemento);
    }

    public String getDetalhes() {
        String saida = "";
        saida = "Grupo: " + this.getDescricao() + "\n";
        for (ElementoSeguranca elemento : elementos) {
            saida += elemento.getDetalhes();
        }
        return saida;
    }
}