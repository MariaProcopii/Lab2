import java.util.Random;

public class Barman {

    void playGame(Player player, Deck deck){

            Random random = new Random();
            deck.addCards();

        int rand1 = random.nextInt(deck.getDeckWith().size());
        int rand2 = random.nextInt(deck.getDeckWith().size());

        Card card1 = deck.getDeckWith().get(rand1);
        Card card2 = deck.getDeckWith().get(rand2);

        card1.findValue();
        card2.findValue();

            if(card1.getValue() < card2.getValue()){

                System.out.println("Player " + player.getIndex() + " won with card " +
                        card2.getSuit() + " " + card2.getRank() + ", value = " + card2.getValue() +
                        ". Received 100 $");
                player.setMoney(100);
                player.satisfied += 10;
            }
            else{

                System.out.println("Barman won with card " +
                        card1.getSuit() + " " + card1.getRank() + ", value = " + card1.getValue() +
                        ". Lose 50 $");
                player.pay(50);
                player.satisfied -= 10;
            }

    }
}
