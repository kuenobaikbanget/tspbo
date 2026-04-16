class Buku {

    String judul, penulis;

    public Buku(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }

    public void info() {
        System.out.println("Judul: " + judul + ", Penulis: " + penulis);
    }
}
