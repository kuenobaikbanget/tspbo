class Person {

    protected String nama;
    protected int umur;

    public Person(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public void tampilkanInfo() {
        System.out.println("Nama        : " + nama);
        System.out.println("Umur        : " + umur);
    }
}
