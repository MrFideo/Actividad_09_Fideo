import java.util.*;

public class Deck {
    private List<Card> cards;

    public Deck() {
        String[] suits = {"Tréboles", "Corazones", "Picas", "Diamantes"};
        String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "A", "J", "Q", "K"};
        cards = new ArrayList<>();

        for (String suit : suits) {
            String color = (suit.equals("Tréboles") || suit.equals("Picas")) ? "Negro" : "Rojo";
            for (String value : values) {
                cards.add(new Card(suit, color, value));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
        System.out.println("Se mezcló el Deck.");
    }

    public void head() {
        if (!cards.isEmpty()) {
            Card card = cards.remove(0);
            System.out.println(card);
            System.out.println("Quedan " + cards.size());
        }
    }

    public void pick() {
        if (!cards.isEmpty()) {
            int index = new Random().nextInt(cards.size());
            Card card = cards.remove(index);
            System.out.println(card);
            System.out.println("Quedan " + cards.size());
        }
    }

    public void hand() {
        for (int i = 0; i < 5; i++) {
            if (!cards.isEmpty()) {
                pick();
            }
        }
    }
}