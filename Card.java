import java.util.Hashtable;

public class Card {
    Deck deck = new Deck();
    String suit;
    String rank;
    int value;
    public Card(String suit, String rank){
        this.suit = suit;
        this.rank = rank;
    }
    public void findValue(){
        deck.cardValue();
        this.value  = deck.cardWithValue.get(rank);
    }

}

