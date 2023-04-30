package ProcessadorArquivo;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import java.util.Map;

public class TesteProcessadorArquivo {
    String arquivo ="F:\\www\\curso\\ita-java\\modulo-02\\src\\ProcessadorArquivo\\arquivo.txt";
    String arquivovazio ="F:\\www\\curso\\ita-java\\modulo-02\\src\\ProcessadorArquivo\\arquivovazio.txt";
    String arquivoinvalido ="F:\\www\\curso\\ita-java\\modulo-02\\src\\ProcessadorArquivo\\arquivoinvalido.txt";

    String arquivochavedupicada ="F:\\www\\curso\\ita-java\\modulo-02\\src\\ProcessadorArquivo\\arquivochavedupicada.txt";

    @Test //Lendo o Arquivo
    public void testLeituraArquivo() throws ProcessadorArquivo.LeituraArquivoException {
        Map<String, String> mapa = ProcessadorArquivo.processar(arquivo);

        Assertions.assertEquals("Eduardo", mapa.get("nome"));
        Assertions.assertEquals("Guerra", mapa.get("sobrenome"));
        Assertions.assertEquals("35", mapa.get("idade"));
    }
    @Test // arquivo vazio
    public void testArquivoVazio() {
        try {
            ProcessadorArquivo.processar(arquivovazio);
            Assertions.fail("Deveria ter lançado a exceção LeituraArquivoException");
        } catch (ProcessadorArquivo.LeituraArquivoException e) {
            Assertions.assertEquals("Arquivo vazio", e.getMessage());
        }
    }

    @Test // Formato Inválido
    public void testFormatoArquivoInvalido() {
        try {
            ProcessadorArquivo.processar(arquivoinvalido);
            Assertions.fail("Deveria ter lançado a exceção LeituraArquivoException");
        } catch (ProcessadorArquivo.LeituraArquivoException e) {
            Assertions.assertEquals("Formato de arquivo inválido", e.getMessage());
        }
    }

    @Test // Chave Duplicada
    public void testChaveDuplicada() {
        try {
            ProcessadorArquivo.processar(arquivochavedupicada);
            Assertions.fail("Deveria ter lançado a exceção LeituraArquivoException");
        } catch (ProcessadorArquivo.LeituraArquivoException e) {
            Assertions.assertEquals("Chave duplicada: nome", e.getMessage());
        }
    }

    @Test //Arquivo Inexistente
    public void testErroAoAbrirArquivo() {
        try {
            ProcessadorArquivo.processar("arquivo_inexistente.txt");
            Assertions.fail("Deveria ter lançado a exceção LeituraArquivoException");
        } catch (ProcessadorArquivo.LeituraArquivoException e) {
            Assertions.assertEquals("Erro ao abrir o arquivo: arquivo_inexistente.txt (O sistema não pode encontrar o arquivo especificado)",
                    e.getMessage());
        }
    }

}
