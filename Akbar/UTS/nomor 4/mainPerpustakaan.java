public class mainPerpustakaan {

    public static void main(String[] args) {
        Perpustakaan perpustakaan = new Perpustakaan();
        Buku buku1 = new Buku("Matematika Diskrit", "Rinaldi Munir");
        Buku buku2 = new Buku("Clean Code", "Robert C. Martin");
        buku1.tampilkanInfo();
        System.out.println("");
        buku2.tampilkanInfo();

        System.out.println("");
        perpustakaan.pinjamBuku(buku1);
        System.out.println("");
        perpustakaan.pinjamBuku(buku1);
        System.out.println("");
        perpustakaan.cetakLaporan();
    }
}
