//import java.util.*;
import java.util.Random;
public class Meal {

    String food;
    String supply;

    void pickFood(Menu menu){
        Random random = new Random();
        int rand1 = random.nextInt(menu.foodList.length);
        int rand2 = random.nextInt(menu.suppliesList.length);
        food = menu.foodList[rand1];
        supply = menu.suppliesList[rand2];
    }
    void stopListCheck(Player player, Menu menu){
        menu.stopList();
        if(food.equals(menu.foodFromSL)){
            pickFood(menu);
            player.satisfied--;
            System.out.println("Food was in stop list.");
        }
        else if(supply.equals(menu.supplyFromSL)){
            pickFood(menu);
            player.satisfied--;
            System.out.println("Supply was in stop list.");
        }
        else{
            System.out.println("Meal is not in stop list.");
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

