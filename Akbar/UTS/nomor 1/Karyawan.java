class Karyawan {

    private int ID;
    private String nama;
    private long gaji;
    private boolean status;

    public Karyawan(int ID, String nama, long gaji) {
        this.ID = ID;
        this.nama = nama;
        this.gaji = gaji;
        this.status = false;
    }

    public void getInfo() {
        System.out.println("ID                  : " + ID);
        System.out.println("Nama                : " + nama);
        System.out.println("Gaji                : Rp " + gaji);
        System.out.println("Apakah Sedang Cuti? : " + status);
    }

    public void setCuti() {
        this.status = true;
        System.out.println(
            "Karyawan dengan ID: " + ID + ", telah melakukan cuti."
        );
    }
}
