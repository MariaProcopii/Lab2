import java.util.Random;

public class Cleaner {
    private boolean answer;

    public void cleanOrNot(){
        Random random = new Random();
        answer = random.nextBoolean();
    }

    public void CleanTable(Table table) {
        cleanOrNot();

        if (answer) {
            table.player.satisfied++;
            System.out.println("Table " + table.getNumber() + " was cleaned :) ");
        }
        else {
            table.player.satisfied--;
            System.out.println("Table " + table.getNumber() + " was not cleaned :( ");
        }
    }
}

