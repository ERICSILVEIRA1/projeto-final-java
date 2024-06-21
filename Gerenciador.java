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

            bWriter.write(game + "\n");

        } catch (IOException e) {
            System.out.println("Houve um erro ao criar ou acessar o arquivo " + ARQUIVO);
        }

    }

    public static void lerGame() throws IOException {

        try (FileReader fReader = new FileReader(ARQUIVO);
                BufferedReader bReader = new BufferedReader(fReader)) {

            String linha;

            while ((linha = bReader.readLine()) != null) {

                System.out.println(linha);

            }

        }

    }

    public static ArrayList<Game> getListaGame() throws IOException, Exception {

        ArrayList<Game> listaJogos = new ArrayList<>();

        try (FileReader fReader = new FileReader(ARQUIVO);
                BufferedReader bReader = new BufferedReader(fReader)) {

            String linha;

            while ((linha = bReader.readLine()) != null) {

                String[] dadosGame = linha.split(", ");

                String dadosGame;
                Game game = new Game(Integer.parseInt(dadosGame[0]),
                        dadosGame[1],
                        dadosGame[2]);

                listaJogos.add(game);
            }
        }

        if (listaJogos.isEmpty()) {

            throw new Exception("\nNão há jogos cadastrados!");
        }

        return listaJogos;

    }

}
