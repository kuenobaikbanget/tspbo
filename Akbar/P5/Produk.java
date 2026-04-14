class Produk {

    private String namaProduk;
    private long harga;
    private long stok;

    public Produk(String namaProduk, long harga, long stok) {
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.stok = stok;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public long getHarga() {
        return harga;
    }

    public long getStok() {
        return stok;
    }

    public void setHarga(long hargaBaru) {
        if (hargaBaru > 0) {
            this.harga = hargaBaru;
        }
    }

    public void tambahStok(long jumlah) {
        if (jumlah > 0) {
            this.harga = jumlah;
        }
    }
}
