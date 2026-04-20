public class mainCharacter {

    public static void main(String[] args) {
        Character player = new Character("Player", 100, 20);
        Character enemy = new Character("Target", 80, 15);

        player.displayStatus();
        System.out.println();
        enemy.displayStatus();

        System.out.println();
        player.attack(enemy);
        enemy.attack(player);

        System.out.println();
        System.out.println(
            "HP Player Setelah Pertempuran: " + player.getHealth()
        );
        System.out.println(
            "HP Enemy Setelah Pertempuran: " + enemy.getHealth()
        );
    }
}
