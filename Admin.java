import java.util.ArrayList;
import java.util.Random;
public class Admin {
    static int nrOfTables = 3;
    int nrOfPlayers;

    public Admin(int nrOfPlayers) {
        this.nrOfPlayers = nrOfPlayers;
    }
    static void setNrOfTables(int tablesNr){
        nrOfTables = tablesNr;
    }
    public int getNrOfTables(){
        return nrOfTables;
    }

    public void provideTable(ArrayList<Player> haveTable,
                             ArrayList<Player> haveNoTable,
                             ArrayList<Table> table) {

        for (int i = 0; i < nrOfPlayers; i++) {

            if (i < nrOfTables) {
                System.out.println("Please take a seat at table" + (i + 1));
                haveTable.add(new Player("Player", (i + 1)));
                haveTable.get(i).satisfied++;
                table.add(new Table((i + 1), haveTable.get(i)));
            }
            else if (i >= nrOfTables*2 ){
                System.out.println("We don't have space even in queue.");
            }
            else{
                System.out.println("We don't have free tables, please wait in the queue " +
                        "at position " + (i + 1));
                haveNoTable.add(new Player("Player", (i + 1)));
                haveNoTable.get(i - nrOfTables).satisfied--;
            }
        }
    }
    public void printPlayers(ArrayList<Player> haveTable,
                             ArrayList<Player> haveNoTable,
                             ArrayList<Table> table){
        for(Player i : haveTable){
            if(i != null){
                System.out.println(i.index);
            }
            else{
                System.out.println("null");
            }
        }
        if(nrOfPlayers > nrOfTables){
            for(Player i : haveNoTable){
                if(i != null){
                    System.out.println(i.index);
                }
                else{
                    System.out.println("null");
                }
            }
        }
    }
    public static ArrayList<Table> table = new ArrayList<>();
    static ArrayList<Player> haveTable = new ArrayList<>();
    static ArrayList<Player> haveNoTable = new ArrayList<>();

    public static void main(String[] args){
        Random random = new Random();
        int nrOfPlayers = random.nextInt(10) + 1;
//        int nrOfPlayers = 8;
        Admin admin = new Admin(nrOfPlayers);
        admin.provideTable(haveTable, haveNoTable, table);
    }
}
