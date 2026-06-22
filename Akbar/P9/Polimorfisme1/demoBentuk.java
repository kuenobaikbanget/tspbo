abstract class Bentuk {

    public abstract double hitungLuas();
}

class Lingkaran extends Bentuk {

    private double jari2;

    public Lingkaran(double jari2) {
        this.jari2 = jari2;
    }

    public double hitungLuas() {
        return Math.PI * jari2 * jari2;
    }
}

class persegiPanjang extends Bentuk {

    private double panjang, lebar;

    public persegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double hitungLuas() {
        return panjang * lebar;
    }
}

public class demoBentuk {

    public static void main(String[] args) {
        Bentuk b1 = new Lingkaran(7);
        Bentuk b2 = new persegiPanjang(5, 3);

        System.out.println("Luas Lingkaran: " + b1.hitungLuas());
        System.out.println("Luas Persegi Panjang: " + b2.hitungLuas());
    }
}
