import java.util.Random;
public class Player {
    static int count;
    int satisfied = 2;
    String food;
    String supply;
    String meal;
    int goHome = 1; // 1 - stay at the restaurant, 0 - leaves;
    String name;
    int index;
    private int money;
    public Player(String name, int index){
        count++;
        this.name = name;
        this.index = index;
        Random random = new Random();
        this.money = random.nextInt(201);
    }
    public int moneyAmount(){
        return money;
    }
    public void pay(int bill){
        this.money -= bill;
    }
    public int playersNr(){
        return count;
    }
}
