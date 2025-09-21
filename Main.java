import java.io.BufferedReader;
import java.io.FileReader; // Importa a classe FileReader
import java.io.IOException;
import java.io.FileNotFoundException; // Importa para lidar com a exceção de arquivo não encontrado

public class Main {
    public static void main(String[] args) {
        // Altere o nome do arquivo-fonte para o nome correto
        String nomeArquivoFonte = "Arquivo_fonte";

        try (BufferedReader leitor = new BufferedReader(new FileReader(nomeArquivoFonte))) {
            AnalisadorLexico analisador = new AnalisadorLexico(leitor);
            Token token;
            
            System.out.println("Iniciando a an\u00e1lise l\u00e9xica do arquivo: " + nomeArquivoFonte);
            
            do {
                token = analisador.proximoToken();
                System.out.println(token);
            } while (token.getTipo() != Token.TipoToken.FIM_DE_ARQUIVO && token.getTipo() != Token.TipoToken.ERRO);
            
            System.out.println("An\u00e1lise l\u00e9xica conclu\u00edda.");
            
        } catch (FileNotFoundException e) {
            System.err.println("Erro: O arquivo '" + nomeArquivoFonte + "' n\u00e3o foi encontrado.");
        } catch (IOException e) {
            System.err.println("Erro de leitura do arquivo: " + e.getMessage());
        }
    }
}
