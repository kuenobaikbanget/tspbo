public class Makanan {

    private String namaMenu;
    private long harga;

    public Makanan(String namaMenu, long harga) {
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
        return this.namaMenu == kategoriMenu.SPESIAL_MENU;
    }
}
