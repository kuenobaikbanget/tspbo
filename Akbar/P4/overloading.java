class Printer {

    void cetak(String teks) {
        System.out.println("Mencetak teks: " + teks);
    }

    void cetak(int angka) {
        System.out.println("Mencetak angka: " + angka);
    }

    public static void main(String[] args) {
        Printer p = new Printer();
        p.cetak("Hello, Java");
        p.cetak(123);
    }
}
