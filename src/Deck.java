import java.util.*; // Importa las clases utilitarias de Java, incluyendo List y ArrayList

public class Deck {
    private List<Card> cards; // Lista para almacenar las cartas del mazo

    // Constructor de Deck que inicializa el mazo con 52 cartas
    public Deck() {
        String[] suits = {"Tréboles", "Corazones", "Picas", "Diamantes"}; // Posibles palos de las cartas
        String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "A", "J", "Q", "K"}; // Posibles valores de las cartas
        cards = new ArrayList<>(); // Inicialización del ArrayList

        // Doble bucle para crear cada combinación de palo y valor
        for (String suit : suits) {
            String color = (suit.equals("Tréboles") || suit.equals("Picas")) ? "Negro" : "Rojo";
            for (String value : values) {
                cards.add(new Card(suit, color, value)); // Añade una nueva carta al mazo
            }
        }
    }

    // Método para mezclar el mazo de cartas
    public void shuffle() {
        Collections.shuffle(cards); // Utiliza Collections.shuffle para mezclar las cartas aleatoriamente
        System.out.println("Se mezcló el Deck.");
    }

    // Método para sacar la primera carta del mazo
    public void head() {
        if (!cards.isEmpty()) {
            Card card = cards.remove(0); // Elimina y retorna la primera carta del mazo
            System.out.println(card);
            System.out.println("Quedan " + cards.size());
        }
    }

    // Método para seleccionar una carta al azar del mazo
    public void pick() {
        if (!cards.isEmpty()) {
            int index = new Random().nextInt(cards.size()); // Genera un índice aleatorio
            Card card = cards.remove(index); // Elimina y retorna la carta en el índice generado
            System.out.println(card);
            System.out.println("Quedan " + cards.size());
        }
    }

    // Método para generar una mano de cinco cartas
    public void hand() {
        for (int i = 0; i < 5; i++) {
            if (!cards.isEmpty()) {
                pick(); // Llama al método pick cinco veces para seleccionar cinco cartas
            }
        }
    }
}