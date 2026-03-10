class Luar {

    static String pesan = "Ini pesan dari static nested class";

    static class dalam {

        void tampil() {
            System.out.println(pesan);
        }
    }
}

public class staticNested {

    public static void main(String[] args) {
        Luar.dalam nested = new Luar.dalam();
        nested.tampil();
    }
}
