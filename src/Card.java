public class Card {
    private String suit;  // Palo de la carta (tréboles, corazones, picas, diamantes)
    private String color; // Color de la carta (rojo o negro, dependiendo del palo)
    private String value; // Valor de la carta (2-10, A, J, Q, K)

    // Constructor de la clase Card que inicializa los atributos suit, color y value.
    public Card(String suit, String color, String value) {
        this.suit = suit;
        this.color = color;
        this.value = value;
    }

    // Método toString que devuelve una representación de la carta como un String.
    @Override
    public String toString() {
        return suit + "," + color + "," + value;
    }
}