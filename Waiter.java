import java.util.Random;

public class Waiter {
    int bill;
    int qualityIndex; // 1 = bad, 2 = good, 3 = nice;
    public Waiter(){
        Random random = new Random();
        this.qualityIndex = random.nextInt(3) + 1;
    }
    public void takeOrder(Menu menu, Meal meal, Player player){
        meal.pickFood(menu);
        meal.stopListCheck(player, menu);
        player.food = meal.food;                 //after cooking
        player.supply = meal.supply;
        player.meal = player.food + " with " + player.supply;
        System.out.println("Player " + player.index + " chose " + player.meal);
    }
    public void bringOrder(){

    }
    public void bringBill(Menu menu, Player player){
        menu.createFoodMenu();
        menu.createSuppMenu();
        int bill1 = menu.foodWithPrice.get(player.food);
        int bill2 = menu.suppliesWithPrice.get(player.supply);
        this.bill = bill1 + bill2;
        player.pay(bill);
        System.out.println("Bill for player " + player.index + " is " + bill + " $");
        System.out.println("Money left: " + player.moneyAmount() + " $");
    }

        public static void main(String[] args){
        Player player = new Player("Hi", 8);
        Meal meal = new Meal();
        Menu menu = new Menu();
        Waiter waiter = new Waiter();
        waiter.takeOrder(menu, meal, player);
        waiter.bringBill(menu, player);
    }
}
