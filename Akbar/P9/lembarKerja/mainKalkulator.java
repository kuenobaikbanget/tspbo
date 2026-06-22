class MainKalkulator {

    public static void main(String[] args) {
        Kalkulator k = new Kalkulator();

        System.out.println("Penjumlahan");
        System.out.println("Hasil pertambahan 5 + 3 = " + k.tambah(5, 3));
        System.out.println(
            "Hasil pertambahan 5.5 + 3.2 = " + k.tambah(5.5, 3.2)
        );
        System.out.println(
            "Hasil pertambahan 5 + 3 + 2 = " + k.tambah(5, 3, 2)
        );
        System.out.println("");

        System.out.println("Pengurangan");
        System.out.println("Hasil pengurangan 10 - 4 = " + k.kurang(10, 4));
        System.out.println(
            "Hasil pengurangan 10.5 - 4.2 = " + k.kurang(10.5, 4.2)
        );
        System.out.println(
            "Hasil pengurangan 20 - 5 - 3 = " + k.kurang(20, 5, 3)
        );
        System.out.println("");

        System.out.println("Perkalian");
        System.out.println("Hasil perkalian 6 * 7 = " + k.kali(6, 7));
        System.out.println("Hasil perkalian 6.5 * 2.0 = " + k.kali(6.5, 2.0));
        System.out.println("Hasil perkalian 2 * 3 * 4 = " + k.kali(2, 3, 4));
        System.out.println("");

        System.out.println("Pembagian");
        System.out.println("Hasil pembagian 20 / 4 = " + k.bagi(20, 4));
        System.out.println("Hasil pembagian 20.0 / 4.0 = " + k.bagi(20.0, 4.0));
        System.out.println(
            "Hasil pembagian 100 / 5 / 4 = " + k.bagi(100, 5, 4)
        );
        System.out.println("");
    }
}
