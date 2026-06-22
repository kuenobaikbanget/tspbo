import java.util.Scanner;

public class KRSApp {

    private static final Scanner input = new Scanner(System.in);
    private static final KRSDAO dao = new KRSDAO();

    public static void main(String[] args) {
        int pilihan;

        do {
            tampilkanMenu();
            pilihan = bacaAngka("Pilih menu: ");

            switch (pilihan) {
                case 1:
                    dao.lihatSemuaMataKuliah();
                    break;
                case 2:
                    tambahKRS();
                    break;
                case 3:
                    hapusKRS();
                    break;
                case 4:
                    tampilkanKRS();
                    break;
                case 5:
                    hitungSKS();
                    break;
                case 0:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Menu tidak tersedia.");
            }
        } while (pilihan != 0);
    }

    private static void tampilkanMenu() {
        System.out.println("\n=== SISTEM MANAJEMEN KRS ===");
        System.out.println("1. Melihat Semua Mata Kuliah");
        System.out.println("2. Menambahkan Mata Kuliah ke KRS");
        System.out.println("3. Menghapus Mata Kuliah dari KRS");
        System.out.println("4. Menampilkan KRS Mahasiswa");
        System.out.println("5. Menghitung Total SKS Mahasiswa");
        System.out.println("0. Keluar");
    }

    private static void tambahKRS() {
        System.out.print("Masukkan NIM      : ");
        String nim = input.nextLine();
        System.out.print("Masukkan Kode MK  : ");
        String kodeMk = input.nextLine();

        dao.tambahMataKuliahKeKRS(nim, kodeMk);
    }

    private static void hapusKRS() {
        System.out.print("Masukkan NIM      : ");
        String nim = input.nextLine();
        System.out.print("Masukkan Kode MK  : ");
        String kodeMk = input.nextLine();

        dao.hapusMataKuliahDariKRS(nim, kodeMk);
    }

    private static void tampilkanKRS() {
        System.out.print("Masukkan NIM      : ");
        String nim = input.nextLine();

        dao.tampilkanKRSMahasiswa(nim);
    }

    private static void hitungSKS() {
        System.out.print("Masukkan NIM      : ");
        String nim = input.nextLine();

        dao.hitungTotalSKS(nim);
    }

    private static int bacaAngka(String pesan) {
        while (true) {
            System.out.print(pesan);
            try {
                return Integer.parseInt(input.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Input harus berupa angka.");
            }
        }
    }
}
