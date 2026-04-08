public class methodReturn {

    public static String nama = "Akbar Dwi Maulana";

    public static String getNama() {
        return nama;
    }

    public static int hitungUmur(int lahir, int sekarang) {
        int umur = sekarang - lahir;
        return umur;
    }

    public static void main(String[] args) {
        String namaSaya = getNama();
        System.out.println("Nama saya: " + namaSaya);
        int umurSaya = hitungUmur(2006, 2026);
        System.out.println("Umur saya: " + umurSaya);
    }
}
