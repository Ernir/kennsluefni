import edu.princeton.cs.algs4.Insertion;
import edu.princeton.cs.algs4.StdOut;

public class Card implements Comparable<Card> {

    private int value;
    private Suit suit;

    public Card(int value, Suit suit) {
        /*
        Constructor for a playing card.
        Accepts a card's number of pips and its Suit.
         */
        if (!(0 < value && value <= 13)) {
            throw new IndexOutOfBoundsException("Cards must have values between 1 and 13");
        }
        this.value = value;
        this.suit = suit;
    }

    @Override
    public int compareTo(Card card) {
        // Útfærið þessa aðferð!
       return 0;
    }

    @Override
    public String toString() {
        /*
        Pretty-printing for playing cards
         */
        String[] cardNames = {
                "Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"
        };
        return cardNames[this.value - 1] + " of " + this.suit.name();
    }

    public static void main(String[] args) {
        // Búið til 8 mismunandi spil, 2 af hverri sort.
        // Setjið þau í fylki og raðið þeim með röðunarreikniriti úr algs4.jar.
        // Skrifið þau síðan  út.


    }
}