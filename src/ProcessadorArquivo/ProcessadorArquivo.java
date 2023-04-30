package ProcessadorArquivo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ProcessadorArquivo {
    public static Map<String, String> processar(String nomeArquivo) throws LeituraArquivoException {
        Map<String, String> mapa = new HashMap<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(nomeArquivo));
            String linha;
            while ((linha = br.readLine()) != null) { // Lê cada linha do arquivo
                String[] partes = linha.split("->"); // Divide a linha em duas partes, separadas pelo "->"
                if (partes.length != 2) { // Verifica se a linha tem exatamente duas partes
                    throw new LeituraArquivoException("Formato de arquivo inválido");
                }
                String chave = partes[0].trim(); // Obtém o texto da esquerda e remove espaços em branco
                String valor = partes[1].trim(); // Obtém o texto da direita e remove espaços em branco
                if (chave.isEmpty() || valor.isEmpty()) { // Verifica se algum dos valores está vazio
                    throw new LeituraArquivoException("Formato de arquivo inválido");
                }
                if (mapa.containsKey(chave)) { // Verifica se a chave já foi usada
                    throw new LeituraArquivoException("Chave duplicada: " + chave);
                }
                mapa.put(chave, valor); // Adiciona a chave e o valor no mapa
            }
            br.close(); // Fecha o arquivo
        } catch (IOException e) { // Exceção de leitura do arquivo
            throw new LeituraArquivoException("Erro ao abrir o arquivo: " + e.getMessage());
        }
        if (mapa.isEmpty()) { // Verifica se o mapa está vazio
            throw new LeituraArquivoException("Arquivo vazio");
        }
        return mapa;
    }

    public static class LeituraArquivoException extends Exception {
        public LeituraArquivoException(String mensagem) {
            super(mensagem);
        }
    }
}
