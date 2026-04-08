class Mobil {

    String merk;

    Mobil(String merk) {
        this.merk = merk;
    }

    void tampilkanInfo() {
        System.out.println("Mobil ini adalah " + merk);
    }

    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("Toyota");
        mobil1.tampilkanInfo();
    }
}
