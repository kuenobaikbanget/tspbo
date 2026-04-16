class Pembayaran {
    double jumlah;

    public Pembayaran(double jumlah) {
        this.jumlah = jumlah;
    }

    public void prosesPembayaran() {
        System.out.println("Pembayaran sejumlah: " + jumlah + " sedang diproses...");
    }
}