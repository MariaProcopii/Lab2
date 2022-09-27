public class Main {
    public static void main(String[] args){
        Player player = new Player("Hi", 8);
        Table table = new Table(1, player);
        Meal meal = new Meal();
        Menu menu = new Menu();
        Cook cook = new Cook();
        Waiter waiter = new Waiter();
        Cleaner cleaner = new Cleaner();
        Barman barman = new Barman();
        Deck deck = new Deck();
        table.qualityCheck();
        waiter.takeOrder(menu, meal, player);
        cook.cooking(meal, waiter, player, table);  //table is dirty
        cleaner.CleanTable(table);
        barman.playGame(player, deck);
        waiter.bringBill(menu, player);
        System.out.println(player.satisfied);
    }
}
