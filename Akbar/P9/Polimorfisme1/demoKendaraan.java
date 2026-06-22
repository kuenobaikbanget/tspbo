class Kendaraan {

    public void kecepatanMaks() {
        System.out.println("Kecepatan Tidak Diketahui");
    }
}

class Mobil extends Kendaraan {

    public void kecepatanMaks() {
        System.out.println("Kecepatan Mobil: 180 km/h");
    }
}

class Motor extends Kendaraan {

    public void kecepatanMaks() {
        System.out.println("Kecepatan Motor: 120 km/h");
    }
}

public class demoKendaraan {

    public static void main(String[] args) {
        Kendaraan k1 = new Mobil();
        Kendaraan k2 = new Motor();

        k1.kecepatanMaks();
        k2.kecepatanMaks();
    }
}
