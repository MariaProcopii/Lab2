public class Cook {

    public void qualityCheck(Waiter waiter, Player player) {
        if (waiter.qualityIndex == 1) {
            player.satisfied--;
            System.out.println("Player " + player.getIndex() + " was angry because waiter was too slow :( ");
        } else if (waiter.qualityIndex == 2) {
            player.satisfied++;
            System.out.println("Player " + player.getIndex() + " was satisfied about waiter work speed :| ");
        } else {
            player.satisfied += 2;
            System.out.println("Player " + player.getIndex() + " was so happy because the waiter worked very fast :) ");
        }
    }

    public void cooking(Meal meal, Waiter waiter, Player player, Table table){
        qualityCheck(waiter, player);
        player.setFood(meal.getFood());
        player.setSupply(meal.getSupply());
        player.setMeal(player.getFood() + " with " + player.getSupply());
        System.out.println("Player " + player.getIndex() + " received " + player.getMeal());
        System.out.println("Now table " + table.getNumber() + " is dirty");
    }
}
