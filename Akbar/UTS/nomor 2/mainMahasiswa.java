public class mainMahasiswa {

    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("Akbar", 241051209, 3.75f);
        mahasiswa1.tampilkanInfo();
        System.out.println("IPK: " + mahasiswa1.getIpk());

        System.out.println();
        mahasiswa1.setIpk(4.0f);
        System.out.println("IPK setelah diubah: " + mahasiswa1.getIpk());
    }
}
