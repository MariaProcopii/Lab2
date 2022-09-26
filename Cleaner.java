import java.util.Random;
public class Cleaner {
    boolean answer;
    public void cleanOrNot(){
        Random random = new Random();
        this.answer = random.nextBoolean();
    }

    public void CleanTable(Table table) {
        cleanOrNot();
        if (answer) {
            if (table.dirty == 1) {
                table.dirty = 0;
                table.player.satisfied++;
                System.out.println("Table " + table.number + " was cleaned :) ");
            } else {
                table.player.satisfied--;
                System.out.println("Table " + table.number + " was not cleaned :( ");
            }
        }
    }
}

