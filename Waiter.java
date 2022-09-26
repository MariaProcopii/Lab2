import java.util.Random;
public class Waiter {
    int bill;
    int qualityIndex; // 1 = bad, 2 = good, 3 = nice;
    public Waiter(){
        Random random = new Random();
        this.qualityIndex = random.nextInt(3) + 1;
    }
    public void takeOrder(Menu menu, Meal meal, Player player){
        meal.pickFood(player, menu);
        meal.stopListCheck(player, menu);
        System.out.println("Player " + player.index + " ordered " + meal.food + " with " + meal.supply);
//        player.food = meal.food;                 //after cooking
//        player.supply = meal.supply;
//        player.meal = player.food + " with " + player.supply;
//        System.out.println("Player " + player.index + " chose " + player.meal);
    }

    public void bringBill(Menu menu, Player player){   //after cook here we can call cook
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
        Cook cook = new Cook();
        Table table = new Table(1, player);
        Waiter waiter = new Waiter();
        Cleaner cleaner = new Cleaner();
        waiter.takeOrder(menu, meal, player);
        cook.cooking(meal, waiter, player, table);  //table is dirty
        cleaner.CleanTable(table);
        waiter.bringBill(menu, player);
        System.out.println(player.satisfied);


    }
}
