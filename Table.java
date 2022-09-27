import java.util.Random;

public class Table {
    Player player;
    private int playerPresent = 0;         // 0 - player left,  1 - player is present
    private final int number;              // table index
    private final int qualityIndex;        // 1 = bad, 2 = good, 3 = nice;

    public int getPlayerPresent() {
        return playerPresent;
    }

    public void setPlayerPresent(int playerPresent) {
        this.playerPresent = playerPresent;
    }

    public int getNumber() {
        return number;
    }

    public Table(int number, Player player){
        Random random = new Random();
        this.qualityIndex = random.nextInt(3) + 1;
        this.number = number;
        this.player = player;
        this.playerPresent = 1;
    }

    public void qualityCheck() {
        if (qualityIndex == 1) {
            player.satisfied--;
            System.out.println("Player " + player.getIndex() + " was not glad to sit at the oldest table :(");

        } else if (qualityIndex == 2) {
            player.satisfied++;
            System.out.println("Player " + player.getIndex() + " was satisfied to receive a good table :|");

        } else {
            player.satisfied += 2;
            System.out.println("Player " + player.getIndex() + " was pleased to receive the best table :) ");
        }
    }
}
