//import java.util.*;
import java.util.Random;
public class Meal {

    String food;
    String supply;

    void pickFood(Player player, Menu menu){
        Random random = new Random();
        int rand1 = random.nextInt(menu.foodList.length);
        int rand2 = random.nextInt(menu.suppliesList.length);
        food = menu.foodList[rand1];
        supply = menu.suppliesList[rand2];
        System.out.println("Player " + player.index + " wants to order " + food + " with " + supply);
    }
    void stopListCheck(Player player, Menu menu){
        menu.stopList();
        if(food.equals(menu.foodFromSL)){
            player.satisfied--;
            System.out.println("Food, ordered by Player " + player.index + " was in Stop-list.\n" +
                    "Player should pick another food");
            pickFood(player, menu);
        }
        else if(supply.equals(menu.supplyFromSL)){
            player.satisfied--;
            System.out.println("Supply, wanted by Player " + player.index + " was in Stop-list.\n" +
                    "Player should pick another supply");
            pickFood(player, menu);
        }
        else{
            System.out.println("Meal, wanted by Player " + player.index + " was not in Stop-list");
        }
    }

//    public static void main(String[] args){
//        Player player = new Player("Hi", 8);
//        Meal meal = new Meal();
//        Menu menu = new Menu();
//        menu.stopList();
//        meal.pickFood(menu);
//
//        meal.stopListCheck(player, menu);
//        System.out.print(meal.food+"\n");
//        System.out.print(meal.supply);
//        System.out.print(player.satisfied);
//    }
}

