public class Cook {

    public void qualityCheck(Waiter waiter, Player player) {
        if (waiter.qualityIndex == 1) {
            player.satisfied--;
            System.out.println("Player " + player.index + " was angry because waiter was too slow :( ");
        } else if (waiter.qualityIndex == 2) {
            player.satisfied++;
            System.out.println("Player " + player.index + " was satisfied about waiter work speed :| ");
        } else {
            player.satisfied += 2;
            System.out.println("Player " + player.index + " was so happy because the waiter worked very fast :) ");
        }
    }

    public void cooking(Meal meal, Waiter waiter, Player player, Table table){
        qualityCheck(waiter, player);
        player.food = meal.food;
        player.supply = meal.supply;
        player.meal = player.food + " with " + player.supply;
        System.out.println("Player " + player.index + " received " + player.meal);
        table.dirty = 1;
        System.out.println("Now table " + table.number + " is dirty");
    }
}
