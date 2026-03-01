public class matematikaTest {
    public static void main(String[] args) {
        double a = 100.0;
        double b = 3.0;
        matematika hitung = new matematika();
        
        System.out.println("Hasil Penjumlahan: " + a + " + " + b + " = " + hitung.jumlah(a, b));
        System.out.println("Hasil Pengurangan: " + a + " - " + b + " = " + hitung.kurang(a, b));
        System.out.println("Hasil Perkalian: " + a + " * " + b + " = " + hitung.kali(a, b));
        System.out.println("Hasil Pembagian: " + a + " / " + b + " = " + hitung.bagi(a, b));
    }
}
