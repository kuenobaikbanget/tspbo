public class mainKaryawan {

    public static void main(String[] args) {
        Karyawan karyawan1 = new Karyawan(67, "Akbar Dwi Maulana", 1500000);

        karyawan1.getInfo();
        System.out.println();
        karyawan1.setCuti();
        System.out.println();
        karyawan1.getInfo();
    }
}
