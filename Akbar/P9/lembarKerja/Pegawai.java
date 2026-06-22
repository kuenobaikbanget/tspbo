abstract class Pegawai {

    protected String nama;

    public Pegawai(String nama) {
        this.nama = nama;
    }

    public abstract double hitungGaji();

    public String getNama() {
        return nama;
    }
}

class PegawaiTetap extends Pegawai {

    private double gajiBulanan;

    public PegawaiTetap(String nama, double gajiBulanan) {
        super(nama);
        this.gajiBulanan = gajiBulanan;
    }

    @Override
    public double hitungGaji() {
        return gajiBulanan;
    }
}

class PegawaiHarian extends Pegawai {

    private int jamKerja;
    private double upahPerJam;

    public PegawaiHarian(String nama, int jamKerja, double upahPerJam) {
        super(nama);
        this.jamKerja = jamKerja;
        this.upahPerJam = upahPerJam;
    }

    @Override
    public double hitungGaji() {
        return jamKerja * upahPerJam;
    }
}
