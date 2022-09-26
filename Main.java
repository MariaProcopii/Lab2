public class Main {
    public static void main(String[] args){
        Player player = new Player("Hi", 8);
        Meal meal = new Meal();
        Menu menu = new Menu();
        Cook cook = new Cook();
        Table table = new Table(1, player);
        Waiter waiter = new Waiter();
        Cleaner cleaner = new Cleaner();
        Barman barman = new Barman();
        Deck deck = new Deck();
        waiter.takeOrder(menu, meal, player);
        cook.cooking(meal, waiter, player, table);  //table is dirty
        cleaner.CleanTable(table);
        barman.playGame(player, deck);
        waiter.bringBill(menu, player);
        System.out.println(player.satisfied);

    }
}
