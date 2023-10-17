import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String[] palabras = {"java", "programacion", "computador", "compilar", "python", "complejo", "array", "lenguaje", "inteligencia", "codigo", "consola", "operador", "programar", "iterar", "software", "debug", "registro", "menu", "interfaz", "aleatorio", "input"};
        int intentosmaximos = 7;

        Ahorcado juego = new Ahorcado(palabras, intentosmaximos);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenid@ al juego del ahorcado de software");

        while (!juego.haTerminado()) {
            System.out.println("Palabra actual: " + String.valueOf(juego.getLetrasSecretas()));
            System.out.println("Intentos restantes: " + juego.getIntentosRestantes());
            System.out.print("Ingresa una letra: ");
            char letra = scanner.next().charAt(0);

            if (!juego.adivinarLetra(letra)) {
                System.out.println("Incorrecto. La letra no está en la palabra.");
            }
        }

        if (juego.getIntentosRestantes() == 0) {
            System.out.println("Ya no tienes más intentos, la palabra era: " + juego.getPalabra());
        } else {
            System.out.println("Felicitaciones, has adivinado la palabra: " + juego.getPalabra());
        }
    }
}



