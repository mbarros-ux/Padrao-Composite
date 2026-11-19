package padroesestruturais.composite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RelatorioSegurancaTest {

    @Test
    void deveRetornarRelatorioDeSeguranca() {

        GrupoAmeacas grupo1 = new GrupoAmeacas("Ameacas de Rede");

        GrupoAmeacas grupo2 = new GrupoAmeacas("Ameacas de Aplicacao");
        Ameaca ameaca21 = new Ameaca("SQL Injection", 9);
        grupo2.addElemento(ameaca21);

        GrupoAmeacas grupo3 = new GrupoAmeacas("Ameacas Fisicas");
        Ameaca ameaca31 = new Ameaca("Acesso nao autorizado", 7);
        Ameaca ameaca32 = new Ameaca("Roubo de equipamento", 8);
        grupo3.addElemento(ameaca31);
        grupo3.addElemento(ameaca32);

        GrupoAmeacas raiz = new GrupoAmeacas("Relatorio Geral de Seguranca");
        raiz.addElemento(grupo1);
        raiz.addElemento(grupo2);
        raiz.addElemento(grupo3);

        RelatorioSeguranca relatorio = new RelatorioSeguranca();
        relatorio.setRaiz(raiz);

        assertEquals("Grupo: Relatorio Geral de Seguranca\n" +
                "Grupo: Ameacas de Rede\n" +
                "Grupo: Ameacas de Aplicacao\n" +
                "Ameaca: SQL Injection - Nivel de Risco: 9\n" +
                "Grupo: Ameacas Fisicas\n" +
                "Ameaca: Acesso nao autorizado - Nivel de Risco: 7\n" +
                "Ameaca: Roubo de equipamento - Nivel de Risco: 8\n", relatorio.getRelatorio());
    }

    @Test
    void deveRetornarExcecaoRelatorioSemRaiz() {
        try {
            RelatorioSeguranca relatorio = new RelatorioSeguranca();
            relatorio.getRelatorio();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Relatorio sem elemento raiz", e.getMessage());
        }
    }
}