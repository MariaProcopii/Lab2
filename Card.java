import java.util.Hashtable;

public class Card {
    Deck deck = new Deck();
    String suit;
    String rank;
    int value;
    public Card(String suit, String rank){
        this.suit = suit;
        this.rank = rank;
        this.value = findValue();
    }
    public int findValue(){
        return deck.cardWithValue.get(rank);
    }

}
