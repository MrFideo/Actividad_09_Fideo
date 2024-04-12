import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Deck deck = new Deck();

    public static void main(String[] args) {
        int option;
        do {
            option = showMenu();
            switch (option) {
                case 1:
                    deck.shuffle();
                    break;
                case 2:
                    deck.head();
                    break;
                case 3:
                    deck.pick();
                    break;
                case 4:
                    deck.hand();
                    break;
                case 0:
                    System.out.println("Gracias por jugar Poker!");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (option != 0);
    }

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
            scanner.next(); // para limpiar el buffer
            System.out.println("Por favor, introduce un número válido.");
        }
        return scanner.nextInt();
    }
}
