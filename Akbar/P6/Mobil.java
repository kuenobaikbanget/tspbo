class Mobil extends Kendaraan {
    int jumlahPintu;

    public Mobil(String merk, int jumlahPintu) {
        super(merk);
        this.jumlahPintu = jumlahPintu;
    }

    public void infoMobil() {
        System.out.println("Mobil " + merk + " memiliki " + jumlahPintu + " pintu");
    }
}