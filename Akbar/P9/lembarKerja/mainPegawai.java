class mainPegawai {

    public static void main(String[] args) {
        Pegawai p1 = new PegawaiTetap("Dina", 50000000);
        Pegawai p2 = new PegawaiHarian("Andi", 100, 400000);

        System.out.println(
            "Gaji " + p1.getNama() + ": Rp" + formatRupiah(p1.hitungGaji())
        );
        System.out.println(
            "Gaji " + p2.getNama() + ": Rp" + formatRupiah(p2.hitungGaji())
        );
    }

    static String formatRupiah(double gaji) {
        String angka = String.valueOf((long) gaji);
        StringBuilder hasil = new StringBuilder();
        int count = 0;
        for (int i = angka.length() - 1; i >= 0; i--) {
            hasil.insert(0, angka.charAt(i));
            count++;
            if (count == 3 && i != 0) {
                hasil.insert(0, ".");
                count = 0;
            }
        }
        return hasil.toString();
    }
}
