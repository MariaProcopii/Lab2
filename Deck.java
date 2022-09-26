import java.util.*;
import java.util.Random;

public class Deck {
    ArrayList<Card> deck = new ArrayList<>();
    Hashtable<String, Integer> cardWithValue = new Hashtable<>();
    String[] suits = {"Hearts", "Diamonds", "Spades", "Clubs"};
    String[] ranks = {"Two", "Three", "Four", "Fife", "Six", "Seven", "Eight" +
                      "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
    int[] index = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};

    public Deck(){
        addCards();
        cardValue();
    }
    public void addCards(){
        for(String suit: suits){
            for(String rank: ranks){
                deck.add(new Card(suit, rank));
            }
        }
    }
    public void cardValue(){
        for(int i = 0; i < ranks.length; i++){
            cardWithValue.put(ranks[i], index[i]);
        }
    }
    public static void main(String[] args){
        Deck deck = new Deck();
        System.out.println(deck.cardWithValue);
    }
}
