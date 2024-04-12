import java.util.Scanner; // Importa la clase Scanner para leer la entrada del teclado

public class Main {
    private static Scanner scanner = new Scanner(System.in); // Crea un objeto Scanner para leer entradas
    private static Deck deck = new Deck(); // Crea un objeto Deck que contiene el mazo de cartas

    // Método principal del programa
    public static void main(String[] args) {
        int option; // Variable para almacenar la opción seleccionada por el usuario
        do {
            option = showMenu(); // Muestra el menú y recibe la opción del usuario
            switch (option) { // Estructura switch para manejar las diferentes opciones
                case 1: // Opción para mezclar el mazo
                    deck.shuffle();
                    break;
                case 2: // Opción para sacar la primera carta
                    deck.head();
                    break;
                case 3: // Opción para seleccionar una carta al azar
                    deck.pick();
                    break;
                case 4: // Opción para generar una mano de cinco cartas
                    deck.hand();
                    break;
                case 0: // Opción para salir del programa
                    System.out.println("Gracias por jugar Poker!");
                    break;
                default: // Manejo de cualquier opción no definida
                    System.out.println("Opción no válida.");
            }
        } while (option != 0); // Repite el menú hasta que el usuario decida salir
    }

    // Método para mostrar el menú y capturar la elección del usuario
    private static int showMenu() {
        System.out.println("\nBienvenido a Poker!");
        System.out.println("Selecciona una opción:");
        System.out.println("1 Mezclar deck");
        System.out.println("2 Sacar una carta");
        System.out.println("3 Carta al azar");
        System.out.println("4 Generar una mano de 5 cartas");
        System.out.println("0 Salir");
        System.out.print("Opción: ");

        while (!scanner.hasNextInt()) {
            scanner.next(); // Limpia el buffer si la entrada no es un entero
            System.out.println("Por favor, introduce un número válido.");
        }
        return scanner.nextInt(); // Devuelve la opción numérica seleccionada
    }
}