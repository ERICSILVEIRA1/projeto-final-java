import java.util.InputMismatchException;
import java.util.Scanner;

//Atualizando a classe Console adcionando Funçoes try catch 

public class Console {

    // private: apenas esta classe enxerga o "leitor"
    // static: esta classe gerencia o "leitor"
    private static Scanner leitor = new Scanner(System.in);

    // método para ler e retornar um valor String:
    public static String lerString(String msg) {
        System.out.print(msg + " ");
        return leitor.nextLine();
    }

    // método para ler e retornar um valor int:
    public static int lerInt(String msg) {
        int valor = 0;
        boolean valido = false;

        while (!valido) {
            try {
                System.out.print(msg + " ");
                valor = leitor.nextInt();
                valido = true;
            } catch (InputMismatchException e) {
                System.out.println("O valor digitado não é do tipo 'int'");
            } finally {
                leitor.nextLine(); // limpeza de buffer
            }
        }

        return valor;
    }

    // método para ler e retornar um valor float:
    public static float lerFloat(String msg) {
        float valor = 0.0f;
        boolean valido = false;

        while (!valido) {
            try {
                System.out.print(msg + " ");
                valor = leitor.nextFloat();
                valido = true;
            } catch (InputMismatchException e) {
                System.out.println("O valor digitado não é do tipo 'float'");
            } finally {
                leitor.nextLine(); // limpeza de buffer
            }
        }

        return valor;
    }
}