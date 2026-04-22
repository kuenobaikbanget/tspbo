public class Perpustakaan {

    private int totalPinjam = 0;

    public void pinjamBuku(Buku buku) {
        if (buku.isTersedia()) {
            buku.setTersedia(false);
            totalPinjam++;
            System.out.println(
                "Buku " + buku.getJudul() + " berhasil dipinjam."
            );
        } else {
            System.out.println("Buku sedang tidak tersedia.");
        }
    }

    public void cetakLaporan() {
        System.out.println("Total peminjaman hari ini: " + totalPinjam);
    }
}
