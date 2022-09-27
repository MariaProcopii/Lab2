import java.util.*;
import java.util.Random;

public class Menu {

    private String foodFromSL;
    private String supplyFromSL;
    private final String[] foodList = {"Burgher", "Pizza", "HotDog", "Sushi"};
    private final int[] foodListPrice = {40, 80, 30, 120};
    private final String[] suppliesList = {"cheese", "pork", "fish", "broccoli",
                                           "sausage", "mushrooms"};
    private final int[] suppliesListPrice = {5, 15, 20, 2, 10, 8};
    private final Hashtable<String, Integer> foodWithPrice = new Hashtable<>();
    private final Hashtable<String, Integer> suppliesWithPrice = new Hashtable<>();

    public String getFoodFromSL() {
        return foodFromSL;
    }

    public String getSupplyFromSL() {
        return supplyFromSL;
    }

    public String[] getFoodList() {
        return foodList;
    }

    public String[] getSuppliesList() {
        return suppliesList;
    }

    public Hashtable<String, Integer> getFoodWithPrice() {
        return foodWithPrice;
    }

    public Hashtable<String, Integer> getSuppliesWithPrice() {
        return suppliesWithPrice;
    }

    public void createFoodMenu(){
        for(int i = 0; i < foodList.length; i++){
            foodWithPrice.put(foodList[i], foodListPrice[i]);
        }
    }

    public void createSuppMenu(){
        for(int i = 0; i < suppliesList.length; i++){
            suppliesWithPrice.put(suppliesList[i], suppliesListPrice[i]);
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


