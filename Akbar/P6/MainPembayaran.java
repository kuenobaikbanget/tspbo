public class MainPembayaran {

    public static void main(String[] args) {
        Pembayaran p1 = new PembayaranTunai(150000);
        Pembayaran p2 = new PembayaranKartu(500000, "1234-5678");
        Pembayaran p3 = new PembayaranEWallet(150000, "user123");

        p1.prosesPembayaran();
        p2.prosesPembayaran();
        p3.prosesPembayaran();
    }
}
