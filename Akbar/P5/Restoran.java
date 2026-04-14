public class Restoran {

    public static void main(String[] args) {
        Makanan makanan = new Makanan(2, "Ayam Goreng", 17000);
        System.out.println("Nama Makanan    : " + makanan.getNamaMenu());
        System.out.println("Harga Makanan   : Rp. " + makanan.getHarga());
        System.out.println("Menu Spesial    : " + makanan.isMenuSpesial());
    }
}
