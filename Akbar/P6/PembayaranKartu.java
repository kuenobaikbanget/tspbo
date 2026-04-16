class PembayaranKartu extends Pembayaran {
    String nomorKartu;

    public PembayaranKartu(double jumlah, String nomorKartu) {
        super(jumlah);
        this.nomorKartu = nomorKartu;
    }

    @Override 
    public void prosesPembayaran() {
        System.out.println("Pembayaran kartu sebesar Rp" + jumlah + " dengan kartu " + nomorKartu + " berhasil dilakukan");
    }
}