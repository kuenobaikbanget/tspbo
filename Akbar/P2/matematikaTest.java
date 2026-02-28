public class matematikaTest {
    public static void main(String[] args) {

        double a = 100.0;
        double b = 3.0;
        double hasilJumlah, hasilKurang, hasilKali, hasilBagi;

        matematika hitung = new matematika();
        hasilJumlah = hitung.jumlah(a, b);
        hasilKurang = hitung.kurang(a, b);
        hasilKali = hitung.kali(a, b);
        hasilBagi = hitung.bagi(a, b);

        System.out.println("Hasil Penjumlahan: " + a + " + " + b + " = " + hasilJumlah);
        System.out.println("Hasil Pengurangan: " + a + " - " + b + " = " + hasilKurang);
        System.out.println("Hasil Perkalian: " + a + " * " + b + " = " + hasilKali);
        System.out.println("Hasil Pembagian: " + a + " / " + b + " = " + hasilBagi);
    }
}
