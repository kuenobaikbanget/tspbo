class MainGame {

    public static void main(String[] args) {
        Enemy[] enemies = new Enemy[3];
        enemies[0] = new Zombie();
        enemies[1] = new Pocong();
        enemies[2] = new Burung();

        for (Enemy e : enemies) {
            e.attack();
        }
    }
}
