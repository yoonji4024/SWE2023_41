import java.util.Random;

public class Blackjack {
    public static void main(String[] args) {
        int seed = Integer.parseInt(args[0]);
        
        Deck deck = new Deck(); // Create the deck.
        deck.shuffle(seed); // Shuffle the deck.
        
        /* Your code */
        
    }
}

class Card {
    public Card() {}
    public Card(int theValue, int theSuit) {}
}

class Deck {
    private Card[] deck;
    private int cardsUsed;
    
    public void shuffle(int seed) {
        Random random = new Random(seed);
        for (int i = deck.length-1; i > 0; i--) {
            int rand = (int)(random.nextInt(i+1));
            Card temp = deck[i];
            deck[i] = deck[rand];
            deck[rand] = temp;
        }
        cardsUsed = 0;
    }
    
    public Card dealCard() {
        if (cardsUsed == deck.length)
            throw new IllegalStateException("No cards are left in the deck.");
        cardsUsed++;
        return deck[cardsUsed - 1];
    }
}

class Hand { /* Your code */ }
class Computer extends Hand { /* Your code */ } // Player automatically participates
class Player extends Hand { /* Your code */ } // Player you control
