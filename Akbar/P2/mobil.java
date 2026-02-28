public class mobil {

    String merk;
    String model;
    int tahun;

    mobil(String merk, String model, int tahun) {
        this.merk = merk;
        this.model = model;
        this.tahun = tahun;
    }

    void tampilkanInfo() {
        System.out.print("Mobil: " + merk);
        System.out.println(" " + model);
        System.out.println("Tahun: " + tahun);
        System.out.println();
    }
}