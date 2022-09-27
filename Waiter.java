import java.util.Random;

public class Waiter {
    int bill;
    int qualityIndex;                                  // 1 = bad, 2 = good, 3 = nice;

    public Waiter(){
        Random random = new Random();
        this.qualityIndex = random.nextInt(3) + 1;
    }

    public void takeOrder(Menu menu, Meal meal, Player player){
        meal.pickFood(player, menu);
        meal.stopListCheck(player, menu);

        System.out.println("Player " + player.getIndex() + " ordered "
                           + meal.getFood() + " with " + meal.getSupply());
    }

    public void bringBill(Menu menu, Player player){   //after cook here we can call cook
        menu.createFoodMenu();
        menu.createSuppMenu();

        int bill1 = menu.getFoodWithPrice().get(player.getFood());
        int bill2 = menu.getSuppliesWithPrice().get(player.getSupply());

        this.bill = bill1 + bill2;
        player.pay(bill);

        System.out.println("Bill for player " + player.getIndex()
                           + " is " + bill + " $");

        System.out.println("Money left: " + player.moneyAmount() + " $");
    }
}
