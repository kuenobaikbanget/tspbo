public class mainProduk {

    public static void main(String[] args) {
        Produk produk1 = new Produk("Laptop", 15000000, 10);
        System.out.println("Nama Produk: " + produk1.getNamaProduk());
        System.out.println("Harga: " + produk1.getHarga());
        System.out.println("Stok: " + produk1.getStok());

        produk1.tambahStok(5);
        produk1.setHarga(14000000);
        System.out.println("Setelah perubahan - Harga: " + produk1.getHarga());
        System.out.println("Setelaghg perubahan - Stok: " + produk1.getStok());
    }
}
