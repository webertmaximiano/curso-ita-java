package TesteInterface;

import Interface.Autoridade;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TesteInterface {
    Autoridade autoridade;

    //Teste implementação Informal
    @Test
    public void testAutoridadeInformal() {
        Autoridade autoridade = new Autoridade("João", "Silva", new Autoridade.FormatadorNomeInformal());
        assertEquals("João", autoridade.getTratamento());
    }
    // Teste Implementação  Respeitoso
    @Test
    public void testAutoridadeRespeitoso() {
        Autoridade autoridade = new Autoridade("João", "Silva", new Autoridade.FormatadorNomeRespeitoso("masculino"));
        assertEquals("Sr. Silva", autoridade.getTratamento());
    }
    // Teste Implementação  Com Titulo
    @Test
    public void testAutoridadeComTitulo() {
        Autoridade autoridade = new Autoridade("João", "Silva", new Autoridade.FormatadorNomeComTitulo("Diamante"));
        assertEquals("Diamante João Silva", autoridade.getTratamento());
    }

}