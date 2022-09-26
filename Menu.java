import java.util.*;
import java.util.Random;
public class Menu {
    String foodFromSL;
    String supplyFromSL;
    String[] foodList = {"Burgher", "Pizza", "HotDog", "Sushi"};
    private final int[] foodListPrice = {40, 80, 30, 120};
    String[] suppliesList = {"cheese", "pork", "fish", "broccoli", "sausage", "mushrooms"};
    private final int[] suppliesListPrice = {5, 15, 20, 2, 10, 8};
    Hashtable<String, Integer> foodWithPrice = new Hashtable<>();
    Hashtable<String, Integer> suppliesWithPrice = new Hashtable<>();

    public void createFoodMenu(){
        for(int i = 0; i < foodList.length; i++){
            foodWithPrice.put(foodList[i], foodListPrice[i]);
//            System.out.println("Food menu was opened");
        }
//        System.out.println(foodWithPrice);
    }
    public void createSuppMenu(){
        for(int i = 0; i < suppliesList.length; i++){
            suppliesWithPrice.put(suppliesList[i], suppliesListPrice[i]);
//            System.out.println("Food menu was opened");
        }
    }
    public void stopList(){
        Random random = new Random();
        int rand1 = random.nextInt(foodList.length);
        int rand2 = random.nextInt(suppliesList.length);
        foodFromSL = foodList[rand1];
        supplyFromSL = suppliesList[rand2];
        System.out.println("Today customers can't order " + foodFromSL + " or " + supplyFromSL);
    }
}


