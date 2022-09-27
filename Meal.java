import java.util.Random;

public class Meal {

    private String food;
    private String supply;

    public String getFood() {
        return food;
    }

    public String getSupply() {
        return supply;
    }

    void pickFood(Player player, Menu menu){
        Random random = new Random();
        int rand1 = random.nextInt(menu.getFoodList().length);
        int rand2 = random.nextInt(menu.getSuppliesList().length);
        food = menu.getFoodList()[rand1];
        supply = menu.getSuppliesList()[rand2];
        System.out.println("Player " + player.getIndex() + " wants to order " + food + " with " + supply);
    }

    void stopListCheck(Player player, Menu menu){
        menu.stopList();
        if(food.equals(menu.getFoodFromSL())){
            player.satisfied--;
            System.out.println("Food, ordered by Player " + player.getIndex() + " was in Stop-list.\n" +
                    "Player should pick another food");
            pickFood(player, menu);
        }
        else if(supply.equals(menu.getSupplyFromSL())){
            player.satisfied--;
            System.out.println("Supply, wanted by Player " + player.getIndex() + " was in Stop-list.\n" +
                    "Player should pick another supply");
            pickFood(player, menu);
        }
        else{
            System.out.println("Meal, wanted by Player " + player.getIndex() + " was not in Stop-list");
        }
    }
}

