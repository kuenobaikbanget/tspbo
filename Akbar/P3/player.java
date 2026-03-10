public class player {
    private int lives;
    private int level;

    public player() {
        this.lives = gameConstants.MAX_LIVES;
        this.level = 1;
    }

    public boolean canLevelUp() {
        return level < gameConstants.MAX_LEVEL;
    }

    public void levelUp() {
        if (canLevelUp()) {
            level++;
            System.out.println("Level up! Current level: " + level);
        } else {
            System.out.println("Reached max level!");
        }
    }

    public void loseLife() {
        if (lives > 0) {
            lives--;
            System.out.println("Lost a life! Remaining lives: " + lives);
        } else {
            System.out.println("Game Over!");
        }
    }
}
