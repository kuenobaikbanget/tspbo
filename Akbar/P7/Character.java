public class Character {

    private String nama;
    private int hp;
    private int damage;

    public Character(String nama, int hp, int damage) {
        this.nama = nama;
        this.hp = hp;
        this.damage = damage;
    }

    public int getHealth() {
        return hp;
    }

    public void takeDamage(int damage) {
        this.hp -= damage;
    }

    public void attack(Character target) {
        target.takeDamage(this.damage);
        System.out.println(
            nama +
                " menyerang " +
                target.nama +
                " dan memberikan " +
                damage +
                " damage."
        );
    }

    public void displayStatus() {
        System.out.println("Nama: " + nama);
        System.out.println("HP: " + hp);
        System.out.println("Attack: " + damage);
    }
}
