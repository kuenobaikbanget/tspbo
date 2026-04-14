public class Makanan {

    private int idKategori;
    private String namaMenu;
    private long harga;

    public Makanan(int idKategori, String namaMenu, long harga) {
        this.idKategori = idKategori;
        this.namaMenu = namaMenu;
        this.harga = harga;
    }

    public String getNamaMenu() {
        return namaMenu;
    }

    public void setNamaMenu(String namaMenu) {
        this.namaMenu = namaMenu;
    }

    public long getHarga() {
        return harga;
    }

    public void setHarga(long harga) {
        this.harga = harga;
    }

    public boolean isMenuSpesial() {
        return this.idKategori == kategoriMenu.SPESIAL_MENU;
    }
}
