public class Employee extends Person {

    private String noKaryawan;

    public Employee(String noKaryawan, String nama, int age) {
        super(nama, age);
        this.noKaryawan = noKaryawan;
    }

    public void info() {
        System.out.println("No Karyawan: " + noKaryawan);
        super.info();
    }
}
