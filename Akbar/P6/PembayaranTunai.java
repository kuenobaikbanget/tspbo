class PembayaranTunai extends Pembayaran{
    public PembayaranTunai(double jumlah) {
        super(jumlah);
    }

    @Override
    public void prosesPembayaran() {
        System.out.println("Pembayaran tunai sebesar Rp" + jumlah + " berhasil dilakukan");
    }
}