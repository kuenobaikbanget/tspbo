class Employee extends Person {

    private int idKaryawan;

    public Employee(String nama, int umur, int idKaryawan) {
        super(nama, umur);
        this.idKaryawan = idKaryawan;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("ID Karyawan : " + idKaryawan);
    }
}
