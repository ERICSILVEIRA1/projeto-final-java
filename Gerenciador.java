import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public abstract class Gerenciador {

    private static final String ARQUIVO = "game.txt";

    public static void salvarJogo(Game game) {
        try (FileWriter fWriter = new FileWriter(ARQUIVO, true);
             BufferedWriter bWriter = new BufferedWriter(fWriter)) {

            bWriter.write(game.toString() + "\n");

        } catch (IOException e) {
            System.out.println("Houve um erro ao criar ou acessar o arquivo " + ARQUIVO);
        }
    }

    public static void lerGame() {
        try (FileReader fReader = new FileReader(ARQUIVO);
             BufferedReader bReader = new BufferedReader(fReader)) {

            String linha;

            while ((linha = bReader.readLine()) != null) {
                System.out.println(linha);
            }

        } catch (IOException e) {
            System.out.println("Houve um erro ao ler o arquivo " + ARQUIVO);
        }
    }

    public static ArrayList<Game> getListaGame() throws IOException {
        ArrayList<Game> listaJogos = new ArrayList<>();

        try (FileReader fReader = new FileReader(ARQUIVO);
             BufferedReader bReader = new BufferedReader(fReader)) {

            String linha;

            while ((linha = bReader.readLine()) != null) {
                String[] dadosGame = linha.split(", ");
                if (dadosGame.length == 3) {
                    try {
                        Game game = new Game(Integer.parseInt(dadosGame[0]), dadosGame[1], dadosGame[2]);
                        listaJogos.add(game);
                    } catch (NumberFormatException e) {
                        System.out.println("Erro ao converter ID do jogo: " + dadosGame[0]);
                    }
                } else {
                    System.out.println("Formato de linha inválido: " + linha);
                }
            }
        }

        if (listaJogos.isEmpty()) {
            throw new IOException("\nNão há jogos cadastrados!");
        }

        return listaJogos;
    }

    public static void main(String[] args) {
        // Testando os métodos
        try {
            Game game1 = new Game(1, "Game1", "Description1");
            salvarJogo(game1);

            lerGame();

            ArrayList<Game> games = getListaGame();
            for (Game game : games) {
                System.out.println(game);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}