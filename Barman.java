import java.util.Random;

public class Barman {
    int rand1;
    int rand2;
    Card card1;
    Card card2;

    void playGame(Player player, Deck deck){
            Random random = new Random();
            deck.addCards();
            this.rand1 = random.nextInt(deck.deckWith.size());
            this.rand2 = random.nextInt(deck.deckWith.size());
            card1 = deck.deckWith.get(rand1);
            card2 = deck.deckWith.get(rand2);
            card1.findValue();
            card2.findValue();
            if(card1.value < card2.value){
                System.out.println("Player " + player.index + " won with card " +
                        card2.suit + " " + card2.rank + ", value = " + card2.value +
                        ". Received 100 $");
                player.setMoney(100);
                player.satisfied += 10;
            }
            else{
                System.out.println("Barman won with card " +
                        card1.suit + " " + card1.rank + ", value = " + card1.value +
                        ". Lose 50 $");
                player.pay(50);
                player.satisfied -= 10;
            }

    }
}
