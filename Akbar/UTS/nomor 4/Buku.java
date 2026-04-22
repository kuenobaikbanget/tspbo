public class Buku {

    private String judul;
    private String penulis;
    private boolean status;

    public Buku(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
        this.status = true;
    }

    public void tampilkanInfo() {
        System.out.println("Judul      : " + judul);
        System.out.println("penulis    : " + penulis);
        System.out.println("Tersedia   : " + status);
    }

    public String getJudul() {
        return judul;
    }

    public void setTersedia(boolean status) {
        this.status = status;
    }

    public boolean isTersedia() {
        return status;
    }
}
