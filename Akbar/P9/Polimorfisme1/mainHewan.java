class Hewan {

    public void suara() {
        System.out.println("Hewan Mengeluarkan Suara");
    }
}

class Kucing extends Hewan {

    public void suara() {
        System.out.println("Meong");
    }
}

class Anjing extends Hewan {

    public void suara() {
        System.out.println("Guk Guk");
    }
}

public class mainHewan {

    public static void main(String[] args) {
        Hewan h1 = new Kucing();
        Hewan h2 = new Anjing();

        h1.suara();
        h2.suara();
    }
}
