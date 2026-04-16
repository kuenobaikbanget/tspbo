class PembayaranEWallet extends Pembayaran  {
    String namaAkun;

    public PembayaranEWallet(double jumlah, String namaAkun) {
        super(jumlah);
        this.namaAkun = namaAkun;
    }

    @Override
    public void prosesPembayaran() {
        System.out.println("Pembayaran e-wallet sebesar Rp" + jumlah + " dengan akun " + namaAkun + " berhasil dilakukan");
    }
}
