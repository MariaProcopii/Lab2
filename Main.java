import java.util.ArrayList;
import java.util.Random;
public class Main {

    public static ArrayList<Table> table = new ArrayList<>();
    static ArrayList<Player> haveTable = new ArrayList<>();
    static ArrayList<Player> haveNoTable = new ArrayList<>();

    public static void main(String[] args){
        Random random = new Random();
        int nrOfPlayers = random.nextInt(10) + 1;
//        int nrOfPlayers = 8;
        Admin admin = new Admin(nrOfPlayers);
        admin.provideTable(haveTable, haveNoTable, table);
        System.out.println(table.get(0).number);







    }
}
