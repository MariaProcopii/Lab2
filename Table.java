import java.util.Random;
public class Table {
    Player player;
    int number; // table index
    int qualityIndex; // 1 = bad, 2 = good, 3 = nice;
    int isMeal;  // 1 - meal on the table ; 0 - no;
    int dirty;  // 1 - needs to be cleaned, 0 - clean;
    public Table(int number, Player player){
        Random random = new Random();
        this.qualityIndex = random.nextInt(3) + 1;
        this.number = number;
        this.player = player;
    }
    public void qualityCheck() {
        if (qualityIndex == 1) {
            player.satisfied--;
        } else if (qualityIndex == 2) {
            player.satisfied++;
        } else {
            player.satisfied += 2;
        }
    }
    public void cleanTable(){
        if(dirty == 1){
            System.out.println("Cleaning the table nr " + number);
            dirty = 0;
            player.satisfied++;
        }
        else{
            System.out.println("Table " + number + " was not cleaned ");
            player.satisfied--;
        }
    }
}
