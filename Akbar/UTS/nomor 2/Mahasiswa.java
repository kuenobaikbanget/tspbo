public class Mahasiswa {

    private String nama;
    private long nim;
    private float ipk;

    public Mahasiswa(String nama, long nim, float ipk) {
        this.nama = nama;
        this.nim = nim;
        this.ipk = ipk;
    }

    public float getIpk() {
        return ipk;
    }

    public float setIpk(float ipk) {
        this.ipk = ipk;
        return ipk;
    }

    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
    }
}
