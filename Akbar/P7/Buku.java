public class Buku {

    private String judul;
    private String pengarang;
    private boolean dipinjam;

    public Buku(String judul, String pengarang) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.dipinjam = false;
    }

    public void tampilkanInfo() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Status: " + (dipinjam ? "Dipinjam" : "Tersedia"));
    }

    public void pinjamBuku(String peminjam) {
        if (!dipinjam) {
            dipinjam = true;
            System.out.println("Buku dipinjam oleh: " + peminjam);
        } else {
            System.out.println("Buku sedang dipinjam!");
        }
    }

    public void kembalikanBuku() {
        dipinjam = false;
        System.out.println("Buku telah dikembalikan");
    }
}
