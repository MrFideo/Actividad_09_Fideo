public class Card {
    private String suit;  // Palo
    private String color; // Color
    private String value; // Valor

    public Card(String suit, String color, String value) {
        this.suit = suit;
        this.color = color;
        this.value = value;
    }

    @Override
    public String toString() {
        return suit + "," + color + "," + value;
    }
}