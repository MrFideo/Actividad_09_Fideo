import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Deck deck = new Deck();

    public static void main(String[] args) {
        int option;
        do {
            try {
                option = showMenu();  // Intenta obtener una opción del menú; puede lanzar una excepción
                switch (option) {
                    case 1:
                        deck.shuffle();
                        break;
                    case 2:
                        deck.head();  // Intenta sacar la primera carta; puede lanzar excepción de mazo vacío
                        break;
                    case 3:
                        deck.pick();  // Intenta sacar una carta al azar; maneja excepción de mazo vacío
                        break;
                    case 4:
                        deck.hand();  // Intenta generar una mano de 5 cartas; maneja excepción de mazo insuficiente
                        break;
                    case 0:
                        System.out.println("Gracias por jugar Poker!");
                        break;
                }
            } catch (Exception e) {  // Captura las excepciones lanzadas en el bloque try
                System.out.println(e.getMessage());  // Muestra el mensaje de la excepción
                if (e.getMessage().equals("Se han agotado las cartas")) {
                    break;  // Termina el programa si se acaban las cartas
                }
            }
        } while (true);  // Repite hasta que el usuario decida salir
    }

    private static int showMenu() throws Exception {  // Método ahora puede lanzar excepciones
        System.out.println("\nBienvenido a Poker!");
        System.out.println("Selecciona una opción:");
        System.out.println("1 Mezclar deck");
        System.out.println("2 Sacar una carta");
        System.out.println("3 Carta al azar");
        System.out.println("4 Generar una mano de 5 cartas");
        System.out.println("0 Salir");
        System.out.print("Opción: ");

        int option = scanner.nextInt();  // Lee la opción del usuario

        if (option < 0 || option > 4) {  // Valida la opción
            throw new Exception("Opción no válida");  // Lanza una excepción si la opción es inválida
        }
        return option;
    }
}