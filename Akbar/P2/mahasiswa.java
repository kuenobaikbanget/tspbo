public class mahasiswa {
    String nama;
    int umur;
    int nim;

    mahasiswa(String nama, int umur, int nim) {
        this.nama = nama;
        this.umur = umur;
        this.nim = nim;
    }

    void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("NIM: " + nim);
        System.out.println();
    }
}
