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

    public void shuffle() {
        Collections.shuffle(cards);  // Baraja las cartas usando un método de la biblioteca Collections
        System.out.println("Se mezcló el Deck.");
    }

    public void head() throws Exception {  // Agregado 'throws Exception' para manejar la posibilidad de mazo vacío
        if (cards.isEmpty()) {
            throw new Exception("Se han agotado las cartas");  // Lanza una excepción si no hay cartas para sacar
        }
        Card card = cards.remove(0);  // Remueve la primera carta del mazo
        System.out.println(card);
        System.out.println("Quedan " + cards.size());
    }

    public void pick() throws Exception {  // Agregado 'throws Exception' para manejar la posibilidad de mazo vacío
        if (cards.isEmpty()) {
            throw new Exception("Se han agotado las cartas");  // Lanza una excepción si no hay cartas para sacar
        }
        int index = new Random().nextInt(cards.size());  // Selecciona un índice aleatorio para la carta a sacar
        Card card = cards.remove(index);  // Remueve la carta seleccionada del mazo
        System.out.println(card);
        System.out.println("Quedan " + cards.size());
    }

    public void hand() throws Exception {  // Agregado 'throws Exception' para manejar la posibilidad de mazo insuficiente
        if (cards.size() < 5) {
            throw new Exception("Se han agotado las cartas");  // Lanza una excepción si no hay suficientes cartas para una mano
        }
        for (int i = 0; i < 5; i++) {
            this.pick();  // Reutiliza el método pick para sacar cinco cartas
        }
    }
}

