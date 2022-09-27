import java.util.Random;
public class Player {
    int satisfied = 2;
    private String food;
    private String supply;
    private String meal;
    private String name;
    private int index;
    private int money;

//    public int getSatisfied() {
//        return satisfied;
//    }
//
//    public void setSatisfied(int satisfied) {
//        this.satisfied = satisfied;
//    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getSupply() {
        return supply;
    }

    public void setSupply(String supply) {
        this.supply = supply;
    }

    public String getMeal() {
        return meal;
    }

    public void setMeal(String meal) {
        this.meal = meal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public int moneyAmount(){
        return money;
    }

    public void setMoney(int money){
        this.money += money;
    }

    public void pay(int bill){
        this.money -= bill;
    }

    public Player(String name, int index){
        this.name = name;
        this.index = index;
        Random random = new Random();
        this.money = random.nextInt(201);
        System.out.println("Player " + index + " has " + money + " $");
    }
}
