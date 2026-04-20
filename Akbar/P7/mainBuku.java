public class mainBuku {

    public static void main(String[] args) {
        Buku buku1 = new Buku("Dilan 1990", "Pidi Baiq");
        Buku buku2 = new Buku("Matematika Diskrit", "Rinaldi Munir");

        System.out.println("Buku yang tersedia:");
        buku1.tampilkanInfo();
        System.out.println();
        buku2.tampilkanInfo();

        System.out.println();
        buku1.pinjamBuku("Dimas");
        buku1.tampilkanInfo();

        System.out.println();
        buku1.kembalikanBuku();
        buku1.tampilkanInfo();
    }
}
