import java.util.Random;
public class Table {
    Player player;
    int playerPresent = 0;  // 0 - player left,  1 - player is present
    int number; // table index
    int qualityIndex; // 1 = bad, 2 = good, 3 = nice;
    int dirty;  // 1 - needs to be cleaned, 0 - clean;
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
            System.out.println("Player " + player.index + " was not glad to sit at the oldest table :(");
        } else if (qualityIndex == 2) {
            player.satisfied++;
            System.out.println("Player " + player.index + " was satisfied to receive a good table :|");
        } else {
            player.satisfied += 2;
            System.out.println("Player " + player.index + " was pleased to receive the best table :) ");
        }
    }
//    public void cleanTable(){
//        if(dirty == 1){
//            System.out.println("Table " + number + " was cleaned :) ");
//            dirty = 0;
//            player.satisfied++;
//        }
//        else{
//            System.out.println("Table " + number + " was not cleaned :( ");
//            player.satisfied--;
//        }
//    }
    public static void main(String[] args){
        Player player = new Player("Hi", 8);
        Table table = new Table(1, player);
        table.qualityCheck();
//        table.cleanTable();

    }
}
