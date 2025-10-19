package br.com.willian.BuscadordeFilmes.principal;

import br.com.willian.BuscadordeFilmes.http.ClienteHttp;
import br.com.willian.BuscadordeFilmes.modelo.FilmeInfo;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        ClienteHttp clienteHttp = new ClienteHttp();
        Gson gson = new Gson();

        try (Scanner leitura = new Scanner(System.in)) {

            while (true) {
                System.out.println("---------------------------------");
                System.out.print("Digite o nome do filme para busca (ou '0' para sair): ");
                String busca = leitura.nextLine();

                // Condição de saída
                if (busca.trim().equalsIgnoreCase("0")) {
                    break;
                }

                try {
                    String buscaCodificada = URLEncoder.encode(busca, StandardCharsets.UTF_8);
                    String suaApiKey = "SUA_CHAVE_AQUI";
                    String url = "http://www.omdbapi.com/?t=" + buscaCodificada + "&apikey=" + suaApiKey;

                    String resposta = clienteHttp.buscarDados(url);

                    FilmeInfo filmeInfo = gson.fromJson(resposta, FilmeInfo.class);

                    if (filmeInfo.Title() == null) {
                        System.out.println("Filme não encontrado. Verifique o título e tente novamente.");
                        continue; // Volta para o início do while
                    }

                    System.out.println("\n===== FICHA TÉCNICA =====");
                    System.out.println("Filme: " + filmeInfo.Title() + " (" + filmeInfo.Year() + ")");
                    System.out.println("Gênero: " + filmeInfo.Genre());
                    System.out.println("Duração: " + filmeInfo.Runtime());
                    System.out.println("-------------------------");
                    System.out.println("Diretor: " + filmeInfo.Director());
                    System.out.println("Atores: " + filmeInfo.Actors());
                    System.out.println("-------------------------");
                    System.out.println("Sinopse: " + filmeInfo.Plot());
                    System.out.println("-------------------------");

                    System.out.println("Avaliações:");
                    if (filmeInfo.imdbRating() != null) {
                        System.out.println("  IMDb: " + filmeInfo.imdbRating() + "/10");
                    }

                    System.out.println("===========================\n");

                } catch (JsonSyntaxException e) {
                    System.out.println("Erro ao converter o JSON: " + e.getMessage());
                    System.out.println("JSON recebido: [verifique o jsonResposta]");
                } catch (Exception e) {
                    System.out.println("Erro: " + e.getMessage());
                }
            }
        } catch (Exception e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }

        System.out.println("\nPrograma finalizado. Volte sempre!");
    }
}
