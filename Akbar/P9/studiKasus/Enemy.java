class Enemy {

    String name;
    int hp;
    int attackPoin;

    void attack() {
        System.out.println("Serang!");
    }
}

class Zombie extends Enemy {

    Zombie() {
        name = "Zombie";
        hp = 100;
        attackPoin = 10;
    }

    @Override
    void attack() {
        System.out.println(name + " menyerang dengan gigitan!");
    }
}

class Pocong extends Enemy {

    Pocong() {
        name = "Pocong";
        hp = 80;
        attackPoin = 15;
    }

    @Override
    void attack() {
        System.out.println(name + " melompat dan menakut-menakuti!");
    }
}

class Burung extends Enemy {

    Burung() {
        name = "Burung";
        hp = 50;
        attackPoin = 8;
    }

    @Override
    void attack() {
        System.out.println(name + " menyerang dari udara dengan paruh!");
    }
}
